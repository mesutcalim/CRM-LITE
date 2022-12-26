package com.etiya.crmlite.api.controllers.common;

import com.etiya.crmlite.business.abstracts.common.IGeneralStatusService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/generalStatus")
@AllArgsConstructor
public class GeneralStatusController {
    private IGeneralStatusService generalStatusService;
}
