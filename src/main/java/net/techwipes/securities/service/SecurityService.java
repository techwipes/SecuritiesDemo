package net.techwipes.securities.service;

import net.techwipes.securities.model.Security;
import net.techwipes.securities.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SecurityService {


    private final SecurityRepository securityRepository;

    @Autowired
    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public Security findById(Integer id){
        return securityRepository.getOne(id);
    }

    public List<Security> findAll(){
        return securityRepository.findAll();

    }

    public Security createSecurity(Security security){
        return securityRepository.save(security);
    }

    public void deleteById(Integer id){
        securityRepository.deleteById(id);

    }



}
