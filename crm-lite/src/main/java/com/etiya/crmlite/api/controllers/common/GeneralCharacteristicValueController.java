package com.etiya.crmlite.api.controllers.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralCharacteristicValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/generalCharactersticValues")
@AllArgsConstructor
public class GeneralCharacteristicValueController {
    private IGeneralCharacteristicValueService generalCharacteristicValueService;
}
