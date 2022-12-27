package com.etiya.crmlite.business.dtos.requests.common.resourceSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateResourceSpecificationRequest {
    private String name;

    private String description;

    private Long statusId;

    private String resourceCode;

}
