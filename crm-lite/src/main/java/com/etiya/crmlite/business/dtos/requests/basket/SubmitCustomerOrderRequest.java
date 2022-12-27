package com.etiya.crmlite.business.dtos.requests.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubmitCustomerOrderRequest {
    private Long customerOrderId;
}
