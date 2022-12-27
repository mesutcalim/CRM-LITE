package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralCharacteristicService;
import com.etiya.crmlite.repositories.common.IGeneralCharacteristicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneralCharacteristicManager implements IGeneralCharacteristicService {
    IGeneralCharacteristicRepository generalCharacteristicRepository;
}
