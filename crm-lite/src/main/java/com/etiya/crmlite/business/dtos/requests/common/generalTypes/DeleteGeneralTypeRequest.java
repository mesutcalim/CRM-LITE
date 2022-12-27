package com.etiya.crmlite.business.dtos.requests.common.generalTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteGeneralTypeRequest {
    private Long generalTypeId;
}
