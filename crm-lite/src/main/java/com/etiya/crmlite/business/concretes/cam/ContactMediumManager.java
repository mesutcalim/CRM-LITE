package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IContactMediumService;
import com.etiya.crmlite.entities.concretes.cam.CntcMedium;
import com.etiya.crmlite.repositories.cam.IContactMediumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactMediumManager implements IContactMediumService {

    private IContactMediumRepository contactMediumRepository;
    @Override
    public void add(CntcMedium cntcMedium) {

    }
}
