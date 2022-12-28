package com.etiya.crmlite.business.dtos.responses.order.businessInteractionStatuses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllBusinessInteractionStatusResponse {

    private Long businessInteractionStatusId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

}

