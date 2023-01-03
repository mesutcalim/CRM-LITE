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
public class CustomerAddressRequest {
    @NotNull(message = "Bu alan boş olamaz.")
    @Min(value = 1,message = "Customer Account Id Sıfırdan büyük olmalıdır.")
    private Long customerId;

}
