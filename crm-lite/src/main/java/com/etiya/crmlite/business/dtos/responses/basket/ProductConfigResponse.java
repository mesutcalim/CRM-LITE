package com.etiya.crmlite.business.dtos.responses.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductConfigResponse {

    private Long productOfferId;
    private String productOfferName;
    private List<ProductSpecificationCharacterConfigResponse> productSpecificationCharacterConfigResponseList;
}