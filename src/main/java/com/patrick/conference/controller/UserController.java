package com.patrick.conference.controller;

import com.patrick.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname",defaultValue = "Pato")String firstName,
    @RequestParam(value = "lastName",defaultValue = "Mwangi")String lastName,
    @RequestParam(value = "age",defaultValue = "27")int age){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }
}
