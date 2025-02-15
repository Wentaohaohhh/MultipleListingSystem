package mls.server_property.controllers;

import mls.server_property.domain.Condominium;
import mls.server_property.services.CondominiumService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class CondominiumController extends ResidentialController{
    private CondominiumService condominiumService;

    public CondominiumController(@Qualifier("condoService") CondominiumService condominiumService) {
        super(condominiumService);
    }
}
