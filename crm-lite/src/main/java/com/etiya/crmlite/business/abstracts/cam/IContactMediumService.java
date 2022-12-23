package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.entities.concretes.cam.CntcMedium;

public interface IContactMediumService {
    void add(CntcMedium cntcMedium);
    //todo:Kullanıcı, kontakt bilgilerinin girildiği ekranda aşağıdaki alanları doldurabilecektir:
    // Email (zorunlu alan)
    // Home/Office Phone
    // Mobile Phone (zorunlu alan)
    // Fax
}
