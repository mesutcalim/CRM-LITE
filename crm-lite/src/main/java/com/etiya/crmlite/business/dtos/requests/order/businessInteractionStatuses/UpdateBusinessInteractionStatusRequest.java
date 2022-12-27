package com.etiya.crmlite.business.dtos.requests.order.businessInteractionStatuses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateBusinessInteractionStatusRequest {

    private Long businessInteractionStatusId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

}