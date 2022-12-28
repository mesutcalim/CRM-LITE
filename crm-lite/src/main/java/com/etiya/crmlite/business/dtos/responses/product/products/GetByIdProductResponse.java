package com.etiya.crmlite.business.dtos.responses.product.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdProductResponse {
    private Long productId;
    private String name;
    private String description;
    private Long transactionId;
    private Long campaignId;
    private Long productOfferId;
}

