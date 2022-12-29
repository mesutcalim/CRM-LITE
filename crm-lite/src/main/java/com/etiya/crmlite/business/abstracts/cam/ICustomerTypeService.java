package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.entities.concretes.cam.CustTp;

public interface ICustomerTypeService {
    CustTp getByCustomerTypeId(Long customerTypeId);
}
