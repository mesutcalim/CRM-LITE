package com.etiya.crmlite.business.dtos.responses.common.serviceSpecificationResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllServiceSpecificationResponse {

    private Long serviceSpecificationId;
    private String name;
    private String description;
    private String serviceCode;
    private Long statusId;
}
