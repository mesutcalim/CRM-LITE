package com.etiya.crmlite.business.dtos.responses.cam.partyRoleTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdPartyRoleTypeResponse {
    private Long partyRoleTypeId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

}
