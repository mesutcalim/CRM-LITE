package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralStatusService;
import com.etiya.crmlite.repositories.common.IGeneralStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneralStatusManager implements IGeneralStatusService {
    IGeneralStatusRepository generalStatusRepository;
}
