package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IIndividualService;
import com.etiya.crmlite.repositories.cam.IIndividualRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IndividualManager implements IIndividualService {
    private IIndividualRepository individualRepository;
}
