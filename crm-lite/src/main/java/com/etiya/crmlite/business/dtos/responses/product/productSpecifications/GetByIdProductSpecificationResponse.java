package com.etiya.crmlite.business.dtos.responses.product.productSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdProductSpecificationResponse {
    private Long productSpecificationId;

    private String name;

    private String description;

    private Long statusId;

    private int isDev;
}
