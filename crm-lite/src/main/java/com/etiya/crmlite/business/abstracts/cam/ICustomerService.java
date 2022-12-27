package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.customers.FindCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.entities.concretes.cam.Cust;

import java.util.List;

public interface ICustomerService {

    //Kullanıcı, filtreleme alanlarından(NatID, Customer ID, Account Number, GSM Number, First Name, Last Name, Order Name) en az birini doldurana kadar “search” butonu pasif kalmalı.
    DataResult<List<FindCustomerResponse>> getCustomersByFilter(FindCustomerRequest findCustomerRequest);

//    todo:Bu foksiyonların getirmesi gereken response şunları içermelidir:
//     Customer ID
//     First Name
//     Second Name
//     Last Name
//     Role
//     NatID

    void addCust(Cust cust);//Bu fonksiyon içine request almalıdır.
    //todo:Bu request şunları içermelidir.
    // First Name (zorunlu alan)
    // Middle Name
    // Last Name (zorunlu alan)
    // Birth Date (zorunlu alan)
    // Gender (zorunlu alan)
    // Father Name
    // Mother Name
    // Nationality ID

    Cust updateCust(Long cust_id);
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

    void deleteCust(Long cust_id);
    //todo:   Eğer aktif bir ürünleri sorgulanacak(get fonksiyonu yazılacak yada başka servisten çağırılacak) varsa
    // “Since the customer has active products, the customer cannot be deleted.” Uyarı mesajı popup şeklinde gösterilebilmelidir.
    // Eğer aktif bir ürünü yoksa müşteri silinecek.
}
