package com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdCustomerAccountProductInvolvementResponse {

    private Long customerAccountProductInvolvementId;

    private Long customerAccountId;

    private Long productId;

    private String shortCode;

    private Long statusId;
}
