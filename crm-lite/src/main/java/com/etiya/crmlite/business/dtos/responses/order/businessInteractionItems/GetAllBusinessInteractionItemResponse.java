package com.etiya.crmlite.business.dtos.responses.order.businessInteractionItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllBusinessInteractionItemResponse {
    private Long businessInteractionItemId;
    private String description;
    private Long rowId;
    private Long dataTypeId;
    private Long actionTypeId;
    private Long statusId;
}
