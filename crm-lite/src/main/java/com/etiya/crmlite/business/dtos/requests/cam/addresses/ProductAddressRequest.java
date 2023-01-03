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
public class ProductAddressRequest {
    @NotNull(message = "Bu alan boş olamaz")
    @Min(value = 1,message = "Product Id Sıfırdan Büyük Olmalıdır.")
    private Long productId;
}

