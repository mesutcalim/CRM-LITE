package com.etiya.crmlite.business.dtos.responses.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdAddressResponse {

    private Long addressId;

    private Long streetId;

    private Long buildingId;

    private String addressDescription;

    private String cityName;

    private String streetName;

    private String countryName;
}

