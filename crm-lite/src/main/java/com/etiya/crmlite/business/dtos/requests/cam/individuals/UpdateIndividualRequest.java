package com.etiya.crmlite.business.dtos.requests.cam.individuals;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateIndividualRequest {
    @NotNull
    private Long customerId;

    @NotNull(message = "Bu alan boş bırakılamaz")
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String middleName;

    @NotNull(message = "Bu alan boş bırakılamaz")
    @Size(max = 50)
    private String lastName;

    @NotNull
    private LocalDate birthDate;

    @NotNull
    @Range(min = 1,max = 2,message = "Cinsiyet gerekli. Ya 1 ya da 2 şeklinde girilmeli.")
    private int genderId;

    private String motherName;

    private String fatherName;

    @Range(min = 10000000000L,max = 99999999999L, message = "TC Kimlik Numarısı 11 Haneli Olmak Zorundadır")
    @NotNull
    private Long nationalId;

}

