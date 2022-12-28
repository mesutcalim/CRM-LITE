package com.etiya.crmlite.business.dtos.responses.order.customerOrders;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdCustomerOrderResponse {

    private Long customerOrderId;

    private Long orderStatusId;

    private Long customerId;
}