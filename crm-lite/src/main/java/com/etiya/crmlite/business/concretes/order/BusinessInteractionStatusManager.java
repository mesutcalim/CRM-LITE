package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionStatusService;
import com.etiya.crmlite.repositories.order.IBusinessInteractionStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessInteractionStatusManager implements IBusinessInteractionStatusService {
    private IBusinessInteractionStatusRepository businessInteractionStatusRepository;
}