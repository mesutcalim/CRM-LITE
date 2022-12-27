package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.entities.concretes.cam.Addr;

import java.util.List;

public interface IAddressService {
    void addAddress(Addr addr);
    //todo: bu fonksiyon içine addres request almalı ve void yerine bir data result dönmelidir.
    // Bu request yapısı :
    // Address Title
    // City (zorunlu alan)
    // Street (zorunlu alan)
    // House/Flat Number (zorunlu alan)
    // Address Description (zorunlu alan) içermelidir.
    // Addres Title yazılmadıysa sistem tarafından “Address 1, Address 2, Address N” şeklinde sıralı
    // bir isimlendirme ataması yapılmalıdır.


    void deleteAddress(int address_id);
    Addr updateAddress(int address_id);

    //todo:Kullanıcı, kaydedilen adresi, adres alanı içerisinde bulunan üç nokta içerisinden “Main” butonuna basarak
    // main adresi olarak seçebilmelidir. Bu seçenek hali hazırda Main adres için pasif olmalıdır.

    
}
