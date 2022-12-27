package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.ICampaignProductOfferingService;
import com.etiya.crmlite.repositories.prod.ICampaignProductOfferingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CampaignProductOfferingManager implements ICampaignProductOfferingService {
    ICampaignProductOfferingRepository campaignProductOfferingRepository;
}
