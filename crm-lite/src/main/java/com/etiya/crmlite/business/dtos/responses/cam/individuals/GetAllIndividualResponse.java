package com.etiya.crmlite.business.dtos.responses.cam.individuals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllIndividualResponse {

    private Long individualId;

    private String firstName;

    private String middleName;

    private String lastName;

    private LocalDate birthDate;

    private int genderId;
}
