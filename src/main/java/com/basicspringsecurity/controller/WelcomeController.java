package com.basicspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/api/home")
    public String welcome(){
        return "welcome to spring boot webapp security";
    }
}
