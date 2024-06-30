package com.basicspringsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ContactUsController {

    @GetMapping("/uapi/contactus")
    public ResponseEntity<Map<String,String>> getContact(){
        Map<String,String> returnMap = new HashMap<>();
        returnMap.put("mobile no","9387655454");
        returnMap.put("email","qwerty@security.com");
        return ResponseEntity.ok(returnMap);
    }
}
