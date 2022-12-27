package com.etiya.crmlite.business.dtos.requests.order.customerOrderItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteCustomerOrderItemRequest {
    private Long customerOrderItemId;

}