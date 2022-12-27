package com.etiya.crmlite.business.concretes.common;

import com.etiya.crmlite.business.abstracts.common.IResourceSpecificationService;
import com.etiya.crmlite.repositories.common.IResourceSpecificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ResourceSpecificationManager implements IResourceSpecificationService {
    IResourceSpecificationRepository resourceSpecificationRepository;
}
