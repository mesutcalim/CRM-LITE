package com.etiya.crmlite.business.dtos.responses.common.resourceSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllResourceSpecificationResponse {
    private Long resourceSpecificationId;
    private String name;
    private String description;
    private Long statusId;
    private String resourceCode;
}

