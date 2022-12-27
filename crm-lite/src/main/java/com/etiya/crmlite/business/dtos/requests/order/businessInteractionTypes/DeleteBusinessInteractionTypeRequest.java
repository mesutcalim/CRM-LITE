package com.etiya.crmlite.business.dtos.requests.order.businessInteractionTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteBusinessInteractionTypeRequest {
    private Long businessInteractionTypeId;

}

