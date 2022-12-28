package com.etiya.crmlite.business.dtos.responses.product.productSpecificationResourceSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdProductSpecificationResourceSpecificationResponse {
    private Long productSpecificationResourceSpecificationId;

    private Long relationTypeId;

    private Long statusId;

    private Long resourceSpecificationId;
}

