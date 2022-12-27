package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.ICampaignService;
import com.etiya.crmlite.repositories.prod.ICampaignRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CampaignManager implements ICampaignService {
    ICampaignRepository campaignRepository;
}
