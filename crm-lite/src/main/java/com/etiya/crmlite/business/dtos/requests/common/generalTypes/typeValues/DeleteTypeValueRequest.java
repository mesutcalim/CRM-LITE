package com.etiya.crmlite.business.dtos.requests.common.generalTypes.typeValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteTypeValueRequest {

    private Long typeValueId;

}
