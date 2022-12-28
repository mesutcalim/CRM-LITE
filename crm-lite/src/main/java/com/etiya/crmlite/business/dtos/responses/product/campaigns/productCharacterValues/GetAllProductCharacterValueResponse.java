package com.etiya.crmlite.business.dtos.responses.product.campaigns.productCharacterValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllProductCharacterValueResponse {
    private Long productCharacterValueId;


    private String value;


    private Long statusId;


    private Long product;


    private Long generalCharacter;


    private Long generalCharacterValue;
}
