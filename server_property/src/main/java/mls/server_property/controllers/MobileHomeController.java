package mls.server_property.controllers;

import mls.server_property.services.MobileHomeService;
import mls.server_property.services.ResidentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/property/residential/mobilehome")
public class MobileHomeController extends ResidentialController{
    public final MobileHomeService mobilehomeService;

    @Autowired
    public MobileHomeController(@Qualifier("mobilehomeServ") ResidentialService resiService) {
        super(resiService);
        this.mobilehomeService = (MobileHomeService) resiService;
    }
}
