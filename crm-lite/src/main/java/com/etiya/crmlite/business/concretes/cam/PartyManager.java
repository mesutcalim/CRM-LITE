package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.dtos.responses.cam.parties.GetByIdPartyResponse;
import com.etiya.crmlite.business.abstracts.cam.IPartyService;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.cam.Party;
import com.etiya.crmlite.repositories.cam.IPartyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartyManager implements IPartyService {
    IPartyRepository partyRepository;

    @Override
    public void addPartyFromIndividual(Party party) {
        this.partyRepository.save(party);
    }

    @Override
    public DataResult<GetByIdPartyResponse> getById(Long id) {
        Party result = this.partyRepository.findById(id).get();
        GetByIdPartyResponse response = GetByIdPartyResponse.builder()
                .partyId(result.getPartyId())
                .partyTypeId(result.getPartyTpId())
                .statusId(result.getStId())
                .build();
        return new SuccessDataResult<>(response);
    }
    @Override
    public Party getByPartyId(Long id) {
        Party party = this.partyRepository.findById(id).get();
        return party;
    }
}

