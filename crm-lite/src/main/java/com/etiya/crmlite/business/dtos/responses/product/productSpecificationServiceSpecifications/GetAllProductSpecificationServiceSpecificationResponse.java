package com.etiya.crmlite.business.dtos.responses.product.productSpecificationServiceSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllProductSpecificationServiceSpecificationResponse {
    private Long productSpecificationServiceSpecificationId;
    private Long relationTypeId;
    private Long statusId;
    private Long productSpecificationId;
}
