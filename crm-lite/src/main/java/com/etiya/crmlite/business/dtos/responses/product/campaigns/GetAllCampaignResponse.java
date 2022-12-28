package com.etiya.crmlite.business.dtos.responses.product.campaigns;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCampaignResponse {
    private Long campaignId;

    private String name;

    private String description;

    private String campaignCode;

    private LocalDateTime activeEDate;

    private Long statusId;

    private int isPenalty;


}
