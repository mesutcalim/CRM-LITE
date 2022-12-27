package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionTypeService;
import com.etiya.crmlite.repositories.order.IBusinessInteractionTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessInteractionTypeManager implements IBusinessInteractionTypeService {
    private IBusinessInteractionTypeRepository businessInteractionTypeRepository;
}
