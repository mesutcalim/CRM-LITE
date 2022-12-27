package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.dtos.requests.cam.customers.CreateCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customers.FindCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.core.util.mapper.ModelMapperService;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.ErrorDataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.entities.concretes.prod.Prod;
import com.etiya.crmlite.repositories.cam.ICustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerManager implements ICustomerService {

    private ICustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    public DataResult<List<FindCustomerResponse>> getCustomersByFilter(FindCustomerRequest findCustomerRequest) {
        List<FindCustomerResponse> result = this.customerRepository.getCustomersByFilter(
                findCustomerRequest.getCustomerId(),
                findCustomerRequest.getFirstName(),
                findCustomerRequest.getLastName(),
                findCustomerRequest.getNatId(),
                findCustomerRequest.getGsmNumber(),
                findCustomerRequest.getCustomerOrderId(),
                findCustomerRequest.getAccountNo());

        return new SuccessDataResult<List<FindCustomerResponse>>("başarılı",result);
    }
    @Override
    public Result addCustomer(CreateCustomerRequest createCustomerRequest) {
        Cust customer = modelMapperService.getMapperforRequest().map(createCustomerRequest,Cust.class);
        Cust savedCust = customerRepository.save(customer);

//        FindCustomerResponse response = modelMapperService.getMapperforResponse()
//                .map(savedCust,FindCustomerResponse.class);
        return new SuccessDataResult("Müşteri başarı ile eklendi!");
    }

    //todo:Buraya Eğer benzer bir kayıt bulunduysa kullanıcıya “A customer is already exist with this NatID”
    // uyarı mesajı gösteren fonksiyon yazılmalıdır.


    @Override
    public Result updateCust(Long cust_id,FindCustomerRequest findCustomerRequest) {

        Cust customer = customerRepository.findById(cust_id).orElseThrow();
        //todo: orElseThrow yerine business exception yazılacak.
        customer = modelMapperService.getMapperforRequest()
                .map(findCustomerRequest , Cust.class);

        customerRepository.save(customer);//update işleminin veri tabanına işlemesi için save methodu çağırdık.
        //zaten id ye göre var olan bir müşteri eklenmez güncellenir!!

        return new SuccessDataResult("Müşteri başarı ile güncellendi.");
    }

    @Override
    public Result deleteCust(Long cust_id) {
        Cust customer = customerRepository.findById(cust_id).orElseThrow();

        if(canBeDeleted(customer)) {
            customer.setStId(84L);
            customerRepository.save(customer);
            return new SuccessDataResult("Müşteri başarı ile silindi.");
        }
        else{
            return new ErrorDataResult("Müşteri silinemedi.Aktif,Beklemede yada Askıda ürünü mevcut.");
        }
    }

    private boolean canBeDeleted(Cust cust){

        if( customerRepository.checkActiveProduct(cust.getCustId()).isEmpty())
        {
            return true;//silinebilir
        }else {
            return false;
        }
    }
}


