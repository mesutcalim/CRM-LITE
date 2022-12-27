package com.etiya.crmlite.business.dtos.requests.order.businessInteractions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateBusinessInteractionRequest {
    private Long businessInteractionId;

    private String description;

    private Long parentBusinessInteractionId;

    private Long dataTypeId;

    private Long customerId;

    private Long businessInteractionSpecificationId;

    private int businessInteractionStatusId;
}
