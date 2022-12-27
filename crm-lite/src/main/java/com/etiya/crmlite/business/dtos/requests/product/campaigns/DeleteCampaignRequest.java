package com.etiya.crmlite.business.dtos.requests.product.campaigns;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteCampaignRequest {
    private Long campaignId;
}
