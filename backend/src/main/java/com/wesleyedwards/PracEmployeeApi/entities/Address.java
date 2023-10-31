package com.wesleyedwards.PracEmployeeApi.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Data
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipcode;
}
