package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IPartyRoleService;
import com.etiya.crmlite.repositories.cam.IPartyRoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartyRoleManager implements IPartyRoleService {
    private IPartyRoleRepository partyRoleRepository;
}
