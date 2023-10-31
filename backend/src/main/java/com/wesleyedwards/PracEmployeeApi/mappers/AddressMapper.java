package com.wesleyedwards.PracEmployeeApi.mappers;

import com.wesleyedwards.PracEmployeeApi.Dtos.AddressRequestDto;
import com.wesleyedwards.PracEmployeeApi.Dtos.AddressResponseDto;
import com.wesleyedwards.PracEmployeeApi.entities.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressResponseDto entityToDto(Address address);

    Address requestDtoToEntity(AddressRequestDto addressRequestDto);

    List<AddressResponseDto> entitiesToDtos(List<Address> addresses);
}
