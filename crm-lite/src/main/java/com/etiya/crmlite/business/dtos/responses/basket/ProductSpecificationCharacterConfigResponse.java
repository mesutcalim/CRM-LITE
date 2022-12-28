package com.etiya.crmlite.business.dtos.responses.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductSpecificationCharacterConfigResponse {

    private Long specificationCharacteristicId;
    private String specificationCharacteristicName;
}
