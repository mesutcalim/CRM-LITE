package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IAddressService;
import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.repositories.cam.IAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressManager implements IAddressService {
    private IAddressRepository iAddressRepository;
    @Override
    public void addAddress(Addr addr) {

    }

    @Override
    public void deleteAddress(int address_id) {

    }

    @Override
    public Addr updateAddress(int address_id) {
        return null;
    }
}
