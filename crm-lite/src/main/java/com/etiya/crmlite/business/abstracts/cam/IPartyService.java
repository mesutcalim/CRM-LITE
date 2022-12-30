package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.responses.cam.parties.GetByIdPartyResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.entities.concretes.cam.Party;

public interface IPartyService {
    void addPartyFromIndividual(Party party);

    DataResult<GetByIdPartyResponse> getById(Long id);
    Party getByPartyId(Long id);
}
