package com.etiya.crmlite.business.dtos.requests.cam.parties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePartyRequest {
    private Long statusId;

    private Long partyTypeId;
}
