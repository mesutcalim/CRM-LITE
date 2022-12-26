package com.etiya.crmlite.business.concretes.requests.cam.individuals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndividualCustomerRequest {

    @NotNull(message = "Bu alan boş bırakılamaz")
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String middleName;

    @NotNull(message = "Bu alan boş bırakılamaz")
    @Size(max = 50)
    private String lastName;
    //
    @NotNull
    private LocalDate birthDate;

    @NotNull
    @Range(min = 1,max = 2,message = "Cinsiyet gerekli. Ya 1 ya da 2 şeklinde girilmeli.")
    private int genderId;

    @Size(max = 50)
    private String motherName;

    @Size(max = 50)
    private String fatherName;
    private Long nationalityId;

    @Valid
    List<CreateAddressForIndividualRequest>createAddressForIndividualRequests;
    private String email;
    private String homePhone;
    private String phone;
    private String fax;



}

