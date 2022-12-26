package com.etiya.crmlite.api.controllers.common;

import com.etiya.crmlite.business.abstracts.common.IEtiyaTypeValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/typeValues")
@AllArgsConstructor
public class EtiyaTypeValueController {
    private IEtiyaTypeValueService etiyaTypeValueService;
}
