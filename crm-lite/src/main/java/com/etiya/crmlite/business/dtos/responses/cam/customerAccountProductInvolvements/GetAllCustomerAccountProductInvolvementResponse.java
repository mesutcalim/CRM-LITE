package com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCustomerAccountProductInvolvementResponse {

    private Long customerAccountProductInvolvementId;

    private String shortCode;

    private Long statusId;
}
