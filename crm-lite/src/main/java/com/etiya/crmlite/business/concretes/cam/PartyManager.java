package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IPartyService;
import com.etiya.crmlite.repositories.cam.IPartyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartyManager implements IPartyService {
    IPartyRepository partyRepository;
}
