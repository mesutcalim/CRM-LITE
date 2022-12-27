package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IServiceSpecificationService;
import com.etiya.crmlite.repositories.common.IServiceSpecificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceSpecificationManager implements IServiceSpecificationService {
    IServiceSpecificationRepository serviceSpecificationRepository;
}
