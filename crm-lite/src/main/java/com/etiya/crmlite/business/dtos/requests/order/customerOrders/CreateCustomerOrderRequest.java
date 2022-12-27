package com.etiya.crmlite.business.dtos.requests.order.customerOrders;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCustomerOrderRequest {

    private Long orderStatusId;

    private Long customerId;

    private Long businessInteractionId;

    private Long businessInteractionSpecificationId;
}
