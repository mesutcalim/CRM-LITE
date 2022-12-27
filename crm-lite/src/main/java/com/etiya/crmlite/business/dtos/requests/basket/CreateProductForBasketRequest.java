package com.etiya.crmlite.business.dtos.requests.basket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CreateProductForBasketRequest {
    private Long customerOrderId;
    private Long customerBillingAccountId;

}
