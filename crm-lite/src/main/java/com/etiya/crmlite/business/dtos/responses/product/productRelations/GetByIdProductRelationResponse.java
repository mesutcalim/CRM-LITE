package com.etiya.crmlite.business.dtos.responses.product.productRelations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdProductRelationResponse {
    private Long productRelationId;
    private Long relationTypeId;
    private int isActive;
    private Long product1;
    private Long product2;
}

