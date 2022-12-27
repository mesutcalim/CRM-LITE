package com.etiya.crmlite.business.dtos.requests.cam.parties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePartyRequest {

    private Long partyId;

    private Long statusId;

    private Long partyTypeId;
}
