package com.etiya.crmlite.business.dtos.requests.product.productCatalogProductOffers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductCatalogProductOfferRequest{
    private Long statusId;
    private Long prodCatalogId;
    private Long prodOfferId;
}
