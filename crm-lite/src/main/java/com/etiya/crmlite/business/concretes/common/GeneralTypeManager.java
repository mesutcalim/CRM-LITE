package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralTypeService;
import com.etiya.crmlite.repositories.common.IGeneralTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneralTypeManager implements IGeneralTypeService {
    IGeneralTypeRepository generalTypeRepository;
}
