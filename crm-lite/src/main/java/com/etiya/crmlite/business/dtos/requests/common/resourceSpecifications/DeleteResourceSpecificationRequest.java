package com.etiya.crmlite.business.dtos.requests.common.resourceSpecifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteResourceSpecificationRequest {
    private Long resourceSpecificationId;
}
