package com.wesleyedwards.PracEmployeeApi.Dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeResponseDto {
    private Long Id;
    private String first_name;
    private String last_name;
    private String phoneNum;
    private AddressResponseDto address;
}
