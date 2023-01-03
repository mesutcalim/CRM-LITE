package com.etiya.crmlite.business.dtos.requests.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAddressRequest {
    @NotNull(message = "Bu alan boş olamaz")
    private Long addressId;
    @NotNull(message = "Bu alan boş olamaz")
    private Long streetId;
    @NotNull(message = "Bu alan boş olamaz")
    private Long buildingId;
    @NotNull(message = "Bu alan boş olamaz")
    private String addressDescription;
    @NotNull(message = "Bu alan boş olamaz")
    @Range(min = 0,max = 1,message = "0 veya 1 şeklinde değer giriniz.")
    private int isActive;
    @NotNull(message = "Bu alan boş olamaz")
    private String cityName;
    @NotNull(message = "Bu alan boş olamaz")
    private String streetName;
    private String buildingName;
    private String countryName;

}
