package com.etiya.crmlite.business.dtos.requests.cam.customers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteCustomerRequest {
    private Long customerId;

}

