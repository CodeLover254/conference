package com.patrick.conference.controller;

import com.patrick.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("Registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("Registration")Registration registration, BindingResult result){
        if(result.hasErrors()){
            System.out.println("There was an error");
            return "registration";
        }
        System.out.println(registration.getName());
        return "redirect:registration";
    }
}
