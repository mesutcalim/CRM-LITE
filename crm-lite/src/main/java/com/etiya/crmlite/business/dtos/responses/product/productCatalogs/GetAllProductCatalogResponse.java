package com.etiya.crmlite.business.dtos.responses.product.productCatalogs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllProductCatalogResponse {
    private Long productCatalogId;
    private String name;
    private String description;
    private Long statusId;
    private String shortCode;

}

