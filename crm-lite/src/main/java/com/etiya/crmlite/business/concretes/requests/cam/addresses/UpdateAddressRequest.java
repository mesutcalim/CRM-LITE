package com.etiya.crmlite.business.concretes.requests.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAddressRequest {
    private Long addressId;
    private Long streetId;
    @NotNull
    private Long buildingId;
    @NotNull
    private String addressDescription;
    private int isActive;
    @NotNull
    private String cityName;
    @NotNull
    private String streetName;
    private String buildingName;
    private String countryName;

}
