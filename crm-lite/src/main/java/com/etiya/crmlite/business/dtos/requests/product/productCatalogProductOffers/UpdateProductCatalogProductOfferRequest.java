package com.etiya.crmlite.business.dtos.requests.product.productCatalogProductOffers;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateProductCatalogProductOfferRequest {
    private Long productCatalogProductOfferId;

    private Long statusId;

    private Long prodCatalogId;// fk productCatal Tablosu

    private Long prodOfferId; // fk productOffer Tablosu
}
