package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IEtiyaTypeValueService;
import com.etiya.crmlite.repositories.common.IEtiyaTypeValueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtiyaTypeValueManager implements IEtiyaTypeValueService {
    private IEtiyaTypeValueRepository etiyaTypeValueRepository;
}
