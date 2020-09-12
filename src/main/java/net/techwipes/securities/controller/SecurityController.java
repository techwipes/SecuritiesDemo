package net.techwipes.securities.controller;


import net.techwipes.securities.model.Security;
import net.techwipes.securities.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SecurityController {

    private final SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/securities")
    public String findAll(Model model) {
        List<Security> securities = securityService.findAll();
        model.addAttribute("securities", securities);
        return "security-list";
    }

    @GetMapping("/security-create")
    public String createSecurityForm(Security security) {
        return "security-create";
    }

    @PostMapping
    public String createSecurity(Security security) {
        securityService.createSecurity(security);
        return "redirect:/securities";
    }

    @GetMapping("security-delete/{id}")
    public String deleteSecurity(@PathVariable("id") Integer id) {
        securityService.deleteById(id);
        return "redirect:/securities";
    }

    @GetMapping("/security-update/{id}")
    public String updateSecurityForm(@PathVariable("id") Integer id, Model model) {
        Security security = securityService.findById(id);
        model.addAttribute("security", security);
        return "security-update";
    }

    @PostMapping("/security-update")
    public String updateUser(Security security) {
        securityService.createSecurity(security);
        return "redirect:/security";
    }


}
