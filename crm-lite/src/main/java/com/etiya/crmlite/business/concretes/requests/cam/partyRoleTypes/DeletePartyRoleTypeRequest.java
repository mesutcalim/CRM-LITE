package com.etiya.crmlite.business.concretes.requests.cam.partyRoleTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeletePartyRoleTypeRequest {

    private Long partyRoleTpId;

}
