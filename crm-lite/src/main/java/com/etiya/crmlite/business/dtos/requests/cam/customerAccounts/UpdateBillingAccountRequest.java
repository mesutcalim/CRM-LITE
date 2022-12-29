package com.etiya.crmlite.business.dtos.requests.cam.customerAccounts;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBillingAccountRequest {
    @NotNull(message = "Zorunlu alan!")
    private Long customerId;
    @NotNull(message = "Zorunlu alan!")
    private Long customerAccountId;
    @NotNull(message = "Zorunlu alan!")
    private String customerAccountDescription;
    @NotNull(message = "Zorunlu alan!")
    private Long addressId;

    @NotNull(message = "Zorunlu alan!")
    private String addressDescription;

    @NotNull(message = "Zorunlu alan!")
    private String cityName;
    @NotNull(message = "Zorunlu alan!")
    private String buildingName;
    @NotNull(message = "Zorunlu alan!")
    private String streetName;
    @NotNull(message = "Zorunlu alan!")
    private String countryName;
    @NotNull(message = "Zorunlu alan!")
    private Long streetId;
    @NotNull(message = "Zorunlu alan!")
    private Long buildingId;

}
