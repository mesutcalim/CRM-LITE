package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralCharacteristicValueService;
import com.etiya.crmlite.repositories.common.IGeneralCharacteristicValueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneralCharacteristicValueManager implements IGeneralCharacteristicValueService {
    IGeneralCharacteristicValueRepository generalCharacteristicValueRepository;
}
