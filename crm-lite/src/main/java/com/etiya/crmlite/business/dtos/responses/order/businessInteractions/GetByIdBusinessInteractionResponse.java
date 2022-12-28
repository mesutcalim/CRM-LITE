package com.etiya.crmlite.business.dtos.responses.order.businessInteractions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetByIdBusinessInteractionResponse {
    private Long businessInteractionId;

    private String description;

    private Long parentBusinessInteractionId;

    private Long rowId;

    private Long dataTypeId;
}
