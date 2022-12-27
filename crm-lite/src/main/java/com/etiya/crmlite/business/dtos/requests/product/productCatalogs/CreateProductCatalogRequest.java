package com.etiya.crmlite.business.dtos.requests.product.productCatalogs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductCatalogRequest {

    private String name;

    private String description;

    private Long statusId;

    private String shortCode;
}
