package com.etiya.crmlite.business.dtos.responses.cam.parties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllPartyResponse {

    private Long partyId;

    private Long statusId;

    private Long partyTypeId;
}
