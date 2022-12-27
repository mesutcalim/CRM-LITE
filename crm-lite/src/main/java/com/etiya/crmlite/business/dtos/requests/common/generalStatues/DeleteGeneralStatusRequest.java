package com.etiya.crmlite.business.dtos.requests.common.generalStatues;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteGeneralStatusRequest {
    private Long generalStatusId;
}

