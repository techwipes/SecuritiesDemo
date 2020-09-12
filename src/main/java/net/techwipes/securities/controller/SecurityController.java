package net.techwipes.securities.controller;


import net.techwipes.securities.model.Security;
import net.techwipes.securities.service.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class SecurityController {

    private SecurityService securityService;

    @GetMapping("/securities")
    public String findAll(){
        List<Security> securityList = securityService.findAll();

        return "";
    }
}
