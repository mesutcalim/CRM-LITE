package com.etiya.crmlite.business.dtos.requests.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAddressRequest {
    @NotNull(message = "Bu alan boş olamaz.")
    @Min(value = 0, message = "Row Id Sıfırdan Küçük Olamaz.")
    private Long rowId; // gn_tp
    @NotNull(message = "Bu alan boş olamaz.")
    @Min(value = 0, message = "Data Type Id Sıfırdan Küçük Olamaz.")
    private Long dataTypeId; // Type Value Tables FK
    @NotNull(message = "Bu alan boş olamaz.")
    @Min(value = 0, message = "Street Id Sıfırdan Küçük Olamaz.")
    private Long streetId;
    @NotNull(message = "Bu alan boş olamaz.")
    @Min(value = 0, message = "Building Id Sıfırdan Küçük Olamaz.")
    private Long buildingId;

    private String addressDescription;
    @NotNull(message = "Bu alan boş olamaz.")
    @Range(min = 0, max = 1,message = "Aralıklara uygun değer girmediniz!")
    private int isActive;
    @NotNull(message = "Bu alan boş olamaz.")
    private String cityName;
    @NotNull(message = "Bu alan boş olamaz.")
    private String streetName;

    private String buildingName;
    @NotNull(message = "Bu alan boş olamaz.")
    @Size(min= 3,max = 50)
    private String countryName;
}
