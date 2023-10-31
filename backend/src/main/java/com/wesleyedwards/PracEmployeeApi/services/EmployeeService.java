package com.wesleyedwards.PracEmployeeApi.services;

import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeRequestDto;
import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeResponseDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponseDto> getAllEmployees();

    EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

    EmployeeResponseDto getEmployeeById(Long id);

    EmployeeResponseDto updateEmployee(EmployeeRequestDto employeeRequestDto, Long id);

    EmployeeResponseDto deleteEmployee(Long id);
}
