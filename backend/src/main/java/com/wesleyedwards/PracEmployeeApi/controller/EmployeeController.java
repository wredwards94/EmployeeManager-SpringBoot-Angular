package com.wesleyedwards.PracEmployeeApi.controller;

import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeRequestDto;
import com.wesleyedwards.PracEmployeeApi.Dtos.EmployeeResponseDto;
import com.wesleyedwards.PracEmployeeApi.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

//  GET Mappings
    @GetMapping
    public List<EmployeeResponseDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeResponseDto getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

//  POST Mappings
    @PostMapping
    public EmployeeResponseDto createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
        return employeeService.createEmployee(employeeRequestDto);
    }

    @PutMapping("/{id}")
    public EmployeeResponseDto updateEmployee(@RequestBody EmployeeRequestDto employeeRequestDto, @PathVariable Long id) {
        return employeeService.updateEmployee(employeeRequestDto, id);
    }

    @DeleteMapping("/{id}")
    public EmployeeResponseDto deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }
}
