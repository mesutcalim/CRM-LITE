package com.etiya.crmlite.business.dtos.requests.order.businessInteractions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBusinessInteractionRequest
{

    private String description;

    private Long parentBusinessInteractionId;

    private Long dataTypeId;

    private Long customerId;

    private Long businessInteractionSpecificationId;

    private Long businessInteractionStatusId;
}
