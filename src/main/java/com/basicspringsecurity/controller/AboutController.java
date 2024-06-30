package com.basicspringsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AboutController {

    @GetMapping("/uapi/about")
    public ResponseEntity<Map<String, String>> getContact() {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("about", "An About Us page exists to share a business’ story and history and provide a deeper connection with customers.\n" + "\n" + "Consumers want to know the team behind the brand they are supporting. An About Us page provides the perfect real estate to pull back the curtain and reveal who is working behind the scenes.\n" + "\n" + "Most importantly, though, an About Us page facilitates trust between the consumer and the business.");
        returnMap.put("email", "qwerty@security.com");
        return ResponseEntity.ok(returnMap);
    }
}
