package com.etiya.crmlite.business.dtos.requests.order.customerOrderCharacterValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteCustomerOrderCharacterValueRequest {
    private Long customerOrderCharacterValueId;
}


