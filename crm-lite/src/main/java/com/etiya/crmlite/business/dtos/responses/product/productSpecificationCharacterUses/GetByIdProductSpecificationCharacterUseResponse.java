package com.etiya.crmlite.business.dtos.responses.product.productSpecificationCharacterUses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdProductSpecificationCharacterUseResponse {
    private Long productSpecificationCharacterUseId;

    private String name;

    private String description;

    private int isActive;

}

