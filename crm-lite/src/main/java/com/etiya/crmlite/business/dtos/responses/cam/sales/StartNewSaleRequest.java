package com.etiya.crmlite.business.dtos.responses.cam.sales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StartNewSaleRequest {

    private Long customerId;

}
