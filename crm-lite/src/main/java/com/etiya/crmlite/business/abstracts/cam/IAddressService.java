package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.addresses.CreateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CustomerAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CustomerUpdateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.UpdateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllCustomerAddressesResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByCustomerUpdateAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByIdAddressResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAddressService {

    DataResult<List<GetAllAddressResponse>> getAll();
    DataResult<GetByIdAddressResponse> getById(Long id);
    Result addAddress(CreateAddressRequest createAddressRequest);
    //todo: bu fonksiyon içine addres request almalı ve void yerine bir data result dönmelidir.
    // Bu request yapısı :
    // Address Title
    // City (zorunlu alan)
    // Street (zorunlu alan)
    // House/Flat Number (zorunlu alan)
    // Address Description (zorunlu alan) içermelidir.
    // Addres Title yazılmadıysa sistem tarafından “Address 1, Address 2, Address N” şeklinde sıralı
    // bir isimlendirme ataması yapılmalıdır.
    public void addAddressForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);
    Result deleteAddress(Long address_id);
    //todo:Kullanıcı, kaydedilen adresi, adres alanı içerisinde bulunan üç nokta içerisinden “Main” butonuna basarak
    // main adresi olarak seçebilmelidir. Bu seçenek hali hazırda Main adres için pasif olmalıdır.
    Result updateAddress(Long address_id, UpdateAddressRequest updateAddressRequest);

    DataResult<List<GetAllCustomerAddressesResponse>> getAllCustomerAddresses(CustomerAddressRequest customerAddressRequest);

    DataResult<GetByCustomerUpdateAddressResponse> customerUpdateAddress(CustomerUpdateAddressRequest customerUpdateAddressRequest, Pageable pageable);

    //GetAll ama sayfalama yapıyor.
    Page<GetAllAddressResponse> getAllWithPage(Pageable pageable);
}
