package com.etiya.crmlite.business.dtos.requests.cam.individuals;

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
public class CreateAddressForIndividualRequest {

    @Size(max = 250)
    @NotNull(message = "Zorunlu alan!")
    private String addressDescription;
    @NotNull(message = "Zorunlu alan!")
    private String cityName;
    @NotNull(message = "Zorunlu alan!")
    @Size(max = 50)
    private String buildingName;
    @NotNull(message = "Zorunlu alan!")
    @Size(max = 50)
    private String streetName;
    @NotNull(message = "Zorunlu alan!")
    private String countryName;
    @NotNull(message = "Zorunlu alan!")
    private Long streetId;
    @NotNull(message = "Zorunlu alan!")
    private Long buildingId;

}
