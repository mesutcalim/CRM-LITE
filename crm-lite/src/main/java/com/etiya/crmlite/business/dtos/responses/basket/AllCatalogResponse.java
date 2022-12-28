package com.etiya.crmlite.business.dtos.responses.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AllCatalogResponse {
    private  Long productOfferId;
    private String productName;
    private Long catalogId;
    private String catalogName;

}