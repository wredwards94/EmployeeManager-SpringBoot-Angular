package com.wesleyedwards.PracEmployeeApi.Dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddressResponseDto {
    private String street;
    private String city;
    private String state;
    private String zipcode;
}
