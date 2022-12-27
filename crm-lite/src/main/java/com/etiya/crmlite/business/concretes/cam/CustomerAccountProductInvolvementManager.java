package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountProductInvolvementService;
import com.etiya.crmlite.repositories.cam.ICustomerAccountProductInvolvementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerAccountProductInvolvementManager implements ICustomerAccountProductInvolvementService {
    private ICustomerAccountProductInvolvementRepository customerAccountProductInvolvementRepository;
}
