package com.etiya.crmlite.business.dtos.responses.order.businessInteractionSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetByIdBusinessInteractionSpecificationResponse {
    private Long businessInteractionSpecificationId;
    private Long parentBusinessInteractionSpecificationId;
    private String name;
    private String description;
    private String shortCode;
    private int isActive;
}
