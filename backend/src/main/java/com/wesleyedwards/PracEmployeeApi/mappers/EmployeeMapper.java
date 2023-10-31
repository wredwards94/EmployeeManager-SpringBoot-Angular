package com.wesleyedwards.PracEmployeeApi.mappers;

import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeRequestDto;
import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeResponseDto;
import com.wesleyedwards.PracEmployeeApi.entities.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface EmployeeMapper {

    EmployeeResponseDto entityToDto(Employee employee);

    Employee requestDtoToEntity(EmployeeRequestDto employeeRequestDto);

    List<EmployeeResponseDto> entitiesToDtos(List<Employee> employees);
}
