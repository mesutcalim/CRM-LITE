package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.customers.CreateCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customers.UpdateCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customers.GetAllCustomerResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customers.GetByIdCustomerResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.entities.concretes.cam.Cust;

import java.util.List;

public interface ICustomerService {

    //Kullanıcı, filtreleme alanlarından(NatID, Customer ID, Account Number, GSM Number, First Name, Last Name, Order Name) en az birini doldurana kadar “search” butonu pasif kalmalı.
    DataResult<List<FindCustomerResponse>> getCustomersByFilter(Long customerId,
                                                                String firstName,
                                                                String lastName,
                                                                Long natId,
                                                                String gsmNumber,
                                                                Long customerOrderId,
                                                                String accountNumber);

    //DataResult<Page<Cust>> findAll(Pageable pageable);
//    todo:Bu foksiyonların getirmesi gereken response şunları içermelidir:
//     Customer ID
//     First Name
//     Second Name
//     Last Name
//     Role
//     NatID

     //Result addCustomer(CreateCustomerRequest createCustomerRequest);//Bu fonksiyon içine request almalıdır.
    //todo:Bu request şunları içermelidir.
    // First Name (zorunlu alan)
    // Middle Name
    // Last Name (zorunlu alan)
    // Birth Date (zorunlu alan)
    // Gender (zorunlu alan)
    // Father Name
    // Mother Name
    // Nationality ID

    Result updateCustomer(UpdateCustomerRequest updateCustomerRequest);
    //todo:Kullanıcı, Customer Info Update sayfasında aşağıdaki alanları güncelleyebilmedir.Mock-up eklenecek ve çizilecek
    // First Name (zorunlu alan)
    // Middle Name
    // Last Name (zorunlu alan)
    // Birth Date (zorunlu alan)
    // Gender (zorunlu alan)
    // Father Name
    // Mother Name
    // Nationality ID (zorunlu alan)

    // EC-10 da 3.madde yanlış.Analiz grubu ile konuşulacak.

    Result deleteCust(Long cust_id);
    //todo:   Eğer aktif bir ürünleri sorgulanacak(get fonksiyonu yazılacak yada başka servisten çağırılacak) varsa
    // “Since the customer has active products, the customer cannot be deleted.” Uyarı mesajı popup şeklinde gösterilebilmelidir.
    // Eğer aktif bir ürünü yoksa müşteri silinecek.

    void addNewCustomerFromIndividual(Cust cust);

    Cust getByCustomerId(Long customerId);
    Result add(CreateCustomerRequest createCustomerRequest);
    DataResult<List<GetAllCustomerResponse>> getAll();
    DataResult<GetByIdCustomerResponse> getById(Long id);
}
