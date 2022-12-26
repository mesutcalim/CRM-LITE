package com.etiya.crmlite.business.concretes.requests.cam.addresses;
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
public class CustomerUpdateAddressRequest {
    @NotNull(message = "Zorunlu alan!")
    private Long addressId;
    @NotNull(message = "Zorunlu alan!")
    private Long customerId;
    @NotNull(message = "Zorunlu alan!")
    private Long streetId;
    @NotNull(message = "Zorunlu alan!")
    private Long buildingId;
    @Size(max = 200)
    @NotNull(message = "Zorunlu alan!")
    private String addressDescription;
    @NotNull(message = "Zorunlu alan!")
    private String cityName;
    @NotNull(message = "Zorunlu alan!")
    private String streetName;
    @NotNull(message = "Zorunlu alan!")
    private String buildingName;
    @NotNull(message = "Zorunlu alan!")
    private String countryName;
}
