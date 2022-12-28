package com.etiya.crmlite.business.dtos.responses.product.productCatalogProductOffers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllProductCatalogProductOfferResponse {

    private Long productCatalogProductOfferId;

    private String productOfferName;

    private Long statusId;

    private Long productCatalog;

    private Long productOffer;
}

