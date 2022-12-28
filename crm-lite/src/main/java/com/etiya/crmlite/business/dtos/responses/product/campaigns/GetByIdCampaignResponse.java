package com.etiya.crmlite.business.dtos.responses.product.campaigns;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdCampaignResponse {
    private Long campaignId;

    private String name;

    private String description;

    private String campaignCode;

    private LocalDateTime activeEDate;

    private Long statusId;

    private int isPenalty;

    private Long campaignProductOfferId;
}
