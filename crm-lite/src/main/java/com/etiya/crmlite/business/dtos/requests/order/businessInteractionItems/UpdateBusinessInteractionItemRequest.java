package com.etiya.crmlite.business.dtos.requests.order.businessInteractionItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateBusinessInteractionItemRequest {
    private Long businessInteractionItemId;

    private String description;

    private Long rowId;

    private Long dataTypeId;

    private Long actionTypeId;

    private Long statusId;

    private Long businessInteractionId;

    private Long businessInteractionSpecificationId;
}
