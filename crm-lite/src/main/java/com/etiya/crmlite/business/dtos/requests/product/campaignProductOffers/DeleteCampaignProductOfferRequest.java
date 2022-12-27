package com.etiya.crmlite.business.dtos.requests.product.campaignProductOffers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteCampaignProductOfferRequest {
    private Long campaignProductOfferId;
}
