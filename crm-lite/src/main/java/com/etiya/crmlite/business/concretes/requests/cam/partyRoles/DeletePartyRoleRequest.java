package com.etiya.crmlite.business.concretes.requests.cam.partyRoles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeletePartyRoleRequest {

    private Long partyRoleId;

}
