package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountService;
import com.etiya.crmlite.repositories.cam.ICustomerAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerAccountManager implements ICustomerAccountService {
    private ICustomerAccountRepository customerAccountRepository;
}
