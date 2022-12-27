package com.etiya.crmlite.business.dtos.requests.common.serviceSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateServiceSpecificationRequest {
    private Long serviceSpecificationId;

    private String name;

    private String description;

    private String serviceCode;

    private Long statusId;
}
