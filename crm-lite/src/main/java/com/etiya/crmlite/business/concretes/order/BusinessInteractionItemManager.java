package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionItemService;
import com.etiya.crmlite.repositories.order.IBusinessInteractionItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessInteractionItemManager implements IBusinessInteractionItemService {
    private IBusinessInteractionItemRepository businessInteractionItemRepository;
}
