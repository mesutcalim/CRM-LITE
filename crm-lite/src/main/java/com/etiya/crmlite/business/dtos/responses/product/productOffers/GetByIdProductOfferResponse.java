package com.etiya.crmlite.business.dtos.responses.product.productOffers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdProductOfferResponse {
    private Long productOfferId;
    private String name;
    private String description;
    private Long parentOfferId;
    private Long productOfferTotalPrice;
    private Long statusId;
    private Long productSpecification;
}

