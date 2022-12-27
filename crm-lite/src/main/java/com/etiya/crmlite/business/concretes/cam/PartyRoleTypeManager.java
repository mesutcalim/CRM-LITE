package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IPartyRoleTypeService;
import com.etiya.crmlite.repositories.cam.IPartyRoleTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartyRoleTypeManager implements IPartyRoleTypeService {
    IPartyRoleTypeRepository partyRoleTypeRepository;
}
