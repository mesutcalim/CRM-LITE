package com.etiya.crmlite.business.dtos.requests.order.businessInteractionItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteBusinessInteractionItemRequest {
    private Long businessInteractionItemId;
}
