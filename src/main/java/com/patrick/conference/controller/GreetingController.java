package com.patrick.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String index(Map<String,Object> model){
        model.put("message","How are you?");
        return "greeting";
    }
}
