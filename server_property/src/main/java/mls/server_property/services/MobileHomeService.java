package mls.server_property.services;

import mls.server_property.repositories.MobileHomeRepo;
import mls.server_property.repositories.ResidentialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mobilehomeServ")
public class MobileHomeService extends ResidentialService{
    private final MobileHomeRepo mobileHomeRepo;

    @Autowired
    public MobileHomeService(@Qualifier("mobilehomeRepo") ResidentialRepo residentialRepo) {
        super(residentialRepo);
        this.mobileHomeRepo = (MobileHomeRepo) residentialRepo;
    }
}
