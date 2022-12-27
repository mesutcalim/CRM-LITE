package com.etiya.crmlite.business.dtos.requests.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCustomerOrderWithCampaignRequest {
    private Long customerId;
    private Long customerAccountId;
    private Long productCampaignId;
}
