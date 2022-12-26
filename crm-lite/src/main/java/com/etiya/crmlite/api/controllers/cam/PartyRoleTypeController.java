package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.IPartyRoleTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cam/partyRoleTypes")
@AllArgsConstructor
public class PartyRoleTypeController {
    private IPartyRoleTypeService partyRoleTypeService;
}
