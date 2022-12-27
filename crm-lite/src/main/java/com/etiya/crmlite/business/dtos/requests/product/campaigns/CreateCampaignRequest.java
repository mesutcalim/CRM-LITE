package com.etiya.crmlite.business.dtos.requests.product.campaigns;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCampaignRequest {

    private String name;

    private String description;

    private String campaignCode;

    private LocalDateTime activeEndDate;

    private Long statusId;

    private int isPenalty;
}

