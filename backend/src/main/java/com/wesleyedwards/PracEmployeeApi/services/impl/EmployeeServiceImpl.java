package com.wesleyedwards.PracEmployeeApi.services.impl;

import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeRequestDto;
import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeResponseDto;
import com.wesleyedwards.PracEmployeeApi.entities.Address;
import com.wesleyedwards.PracEmployeeApi.entities.Employee;
import com.wesleyedwards.PracEmployeeApi.mappers.EmployeeMapper;
import com.wesleyedwards.PracEmployeeApi.repository.EmployeeRepository;
import com.wesleyedwards.PracEmployeeApi.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeResponseDto> getAllEmployees() {
        return employeeMapper.entitiesToDtos(employeeRepository.findAllByDeletedFalse());
    }

    @Override
    public EmployeeResponseDto getEmployeeById(Long id) {
        Optional<Employee> foundEmployee = employeeRepository.findById(id);

        return foundEmployee.map(employeeMapper::entityToDto).orElse(null);
    }

    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = employeeMapper.requestDtoToEntity(employeeRequestDto);
//        employee.setFirst_name(employeeRequestDto.getFirst_name());
//        employee.setLast_name(employeeRequestDto.getLast_name());
//        employee.setPhoneNum(employeeRequestDto.getPhoneNum());

//        System.out.println(employee);
        return employeeMapper.entityToDto(employeeRepository.saveAndFlush(employee));
    }

    @Override
    public EmployeeResponseDto updateEmployee(EmployeeRequestDto employeeRequestDto, Long id) {
        Optional<Employee> foundEmployee = employeeRepository.findByIdAndDeletedFalse(id);

        if(foundEmployee.isEmpty()) {
            return null;
        }

        Employee employee = foundEmployee.get();
        Address address = foundEmployee.get().getAddress();
        employee.setFirst_name(employeeRequestDto.getFirst_name());
        employee.setLast_name(employeeRequestDto.getLast_name());
        employee.setPhoneNum(employeeRequestDto.getPhoneNum());

        return employeeMapper.entityToDto(employeeRepository.saveAndFlush(employee));
    }

    @Override
    public EmployeeResponseDto deleteEmployee(Long id) {
        Optional<Employee> foundEmployee = employeeRepository.findByIdAndDeletedFalse(id);

        if(foundEmployee.isEmpty()) {
            return null;
        }

        foundEmployee.get().setDeleted(true);
        return employeeMapper.entityToDto(employeeRepository.saveAndFlush(foundEmployee.get()));
    }


}
