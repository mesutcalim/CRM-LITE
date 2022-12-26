package com.etiya.crmlite.api.controllers.prod;


import com.etiya.crmlite.business.abstracts.prod.ICampaignProductOfferingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/campaignProductOfferings")
@AllArgsConstructor
public class CampaignProductOfferingController {
    private ICampaignProductOfferingService campaignProductOfferingService;



}
