package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.business.abstracts.cam.ICustomerService;

import java.util.List;

public class CustomerManager implements ICustomerService {
    @Override
    public Cust getById() {
        return null;
    }

    @Override
    public Cust getByNatId() {
        return null;
    }

    @Override
    public List<Cust> getByAcctNo() {
        return null;
    }

    @Override
    public Cust getByPhoneNumber() {
        return null;
    }

    @Override
    public List<Cust> getByNFirstName() {
        return null;
    }

    @Override
    public List<Cust> getByLastName() {
        return null;
    }

    @Override
    public List<Cust> getByOrderNumber() {
        return null;
    }

    @Override
    public void addCust(Cust cust) {

    }

    //todo:Buraya Eğer benzer bir kayıt bulunduysa kullanıcıya “A customer is already exist with this NatID”
    // uyarı mesajı gösteren fonksiyon yazılmalıdır.


    @Override
    public Cust updateCust(Long cust_id) {
        return null;
    }

    @Override
    public void deleteCust(Long cust_id) {

    }
}
