package com.wesleyedwards.PracEmployeeApi.Dtos;

import com.wesleyedwards.PracEmployeeApi.entities.Address;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeRequestDto {
    private String first_name;
    private String last_name;
    private String phoneNum;
    private AddressRequestDto addressRequestDto;
}
