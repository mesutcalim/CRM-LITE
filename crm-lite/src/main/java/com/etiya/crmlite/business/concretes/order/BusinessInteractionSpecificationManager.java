package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionSpecificationService;
import com.etiya.crmlite.repositories.order.IBusinessInteractionSpecificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessInteractionSpecificationManager implements IBusinessInteractionSpecificationService {
    private IBusinessInteractionSpecificationRepository businessInteractionSpecificationRepository;
}
