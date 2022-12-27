package com.etiya.crmlite.business.dtos.requests.common.generalChars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteGeneralCharacterRequest {

    private Long characterId;

}

