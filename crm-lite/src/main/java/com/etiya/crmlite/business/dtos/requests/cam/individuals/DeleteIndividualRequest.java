package com.etiya.crmlite.business.dtos.requests.cam.individuals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteIndividualRequest {

    private Long individualId;

}

