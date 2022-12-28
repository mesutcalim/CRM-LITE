package com.etiya.crmlite.business.dtos.responses.cam.individuals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByAddressForIndividualResponse {

    private Long customerId;
    private Long addressId;
}
