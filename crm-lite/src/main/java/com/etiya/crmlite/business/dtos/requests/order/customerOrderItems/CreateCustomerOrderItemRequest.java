package com.etiya.crmlite.business.dtos.requests.order.customerOrderItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCustomerOrderItemRequest {

    private Long customerAccountId;

    private Long newCustomerAccountId;

    private Long productId;

    private Long productOfferId;

    private Long campaignId;

    private Long isNeedShipment;

    private String offerName;

    private String productName;

    private Long productSpecificationId;

    private Long customerId;

    private Long newCustomerId;

    private String campaignName;

    private Long customerOrderId;

    private Long businessInteractionId;
}
