package com.etiya.crmlite.business.dtos.requests.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAddressRequest {
    private Long rowId; // gn_tp
    private Long dataTypeId; // Type Value Tables FK
    private Long streetId;
    @NotNull
    private Long buildingId;
    @NotNull
    private String addressDescription;
    @NotNull
    private int isActive;
    @NotNull
    private String cityName;
    @NotNull
    private String streetName;
    private String buildingName;
    @NotNull
    @Size(min= 3,max = 50)
    private String countryName;
}
