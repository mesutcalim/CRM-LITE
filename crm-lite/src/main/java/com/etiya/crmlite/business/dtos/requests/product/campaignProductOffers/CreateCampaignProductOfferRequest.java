package com.etiya.crmlite.business.dtos.requests.product.campaignProductOffers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCampaignProductOfferRequest {

    private Long priority;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int isActive;

    private String prodOfferName;

    private Long campaignId;

    private Long productOfferId;
}

