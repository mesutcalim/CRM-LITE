package com.etiya.crmlite.business.dtos.requests.order.businessInteractionSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteBusinessInteractionSpecificationRequest {
    private Long businessInteractionSpecificationId;
}

