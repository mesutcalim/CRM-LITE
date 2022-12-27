package com.etiya.crmlite.business.dtos.requests.order.businessInteractionSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBusinessInteractionSpecificationRequest {

    private Long parentBusinessInteractionSpecificationId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

    private int businessInteractionTypeId;

}
