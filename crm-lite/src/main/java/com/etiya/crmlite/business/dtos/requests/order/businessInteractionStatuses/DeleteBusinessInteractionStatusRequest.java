package com.etiya.crmlite.business.dtos.requests.order.businessInteractionStatuses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteBusinessInteractionStatusRequest {
    private Long businessInteractionStatusId;

}
