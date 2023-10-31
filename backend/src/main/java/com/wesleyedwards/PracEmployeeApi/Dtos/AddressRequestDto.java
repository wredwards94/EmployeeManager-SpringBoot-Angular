package com.wesleyedwards.PracEmployeeApi.Dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class AddressRequestDto {
    private String street;
    private String city;
    private String state;
    private String zipcode;
}
