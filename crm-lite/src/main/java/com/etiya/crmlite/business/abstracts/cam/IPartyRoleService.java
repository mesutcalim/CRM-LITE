package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.entities.concretes.cam.PartyRole;

public interface IPartyRoleService {
    void addPartyRoleFromIndividual(PartyRole partyRole);

    PartyRole getByPartyRoleId(Long partyRoleId);
}


