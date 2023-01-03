package com.etiya.crmlite.business.dtos.requests.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteAddressRequest {
    @NotNull(message = "Zorunlu alan boş olmamalıdır.")
    @Min(value = 0,message = "Adres Id Sıfırdan Büyük Olmalıdır.")
    private Long addressId;
}
