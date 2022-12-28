package com.etiya.crmlite.business.dtos.responses.product.campaignProductOffers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCampaignProductOfferResponse {
    private Long campaignProductOfferId;

    private Long prio;

    private LocalDateTime sDate;

    private LocalDateTime eDate;

    private int isActive;

    private String productOfferName;

    private Long campaignId;

}
