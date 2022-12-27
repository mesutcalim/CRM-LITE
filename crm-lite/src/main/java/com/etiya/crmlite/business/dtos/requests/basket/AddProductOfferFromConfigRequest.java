package com.etiya.crmlite.business.dtos.requests.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddProductOfferFromConfigRequest {
    private Long productOfferId;
    private List<AddProductCharacterValueFromConfigRequest> productCharacterValueFromConfigRequestList;

}
