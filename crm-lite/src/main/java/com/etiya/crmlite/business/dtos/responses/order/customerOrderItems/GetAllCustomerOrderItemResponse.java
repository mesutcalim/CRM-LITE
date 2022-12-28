package com.etiya.crmlite.business.dtos.responses.order.customerOrderItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCustomerOrderItemResponse {
    private Long customerOrderItemId;
    private Long customerAccountId;
    private Long newCustomerAccountId;
    private Long productId;
    private Long productOfferId;
    private Long campaignId;
    private Long customerOrderId;

}
