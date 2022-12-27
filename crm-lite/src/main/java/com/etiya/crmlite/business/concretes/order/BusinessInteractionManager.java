package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionService;
import com.etiya.crmlite.repositories.order.IBusinessInteractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessInteractionManager implements IBusinessInteractionService {
    private IBusinessInteractionRepository businessInteractionRepository;
}
