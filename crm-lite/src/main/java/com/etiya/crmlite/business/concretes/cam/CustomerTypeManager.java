package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerTypeService;
import com.etiya.crmlite.repositories.cam.ICustomerTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerTypeManager implements ICustomerTypeService {
    private ICustomerTypeRepository customerTypeRepository;

}
