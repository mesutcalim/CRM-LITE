package com.etiya.crmlite.api.controllers.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralCharacteristicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/generalCharacteristics")
@AllArgsConstructor
public class GeneralCharacteristicController {
    private IGeneralCharacteristicService generalCharacteristicService;
}
