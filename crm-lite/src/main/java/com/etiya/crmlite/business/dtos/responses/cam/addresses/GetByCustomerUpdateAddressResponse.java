package com.etiya.crmlite.business.dtos.responses.cam.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByCustomerUpdateAddressResponse {
    private Long customerId;
    private Long addressId;
}

