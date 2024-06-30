package com.basicspringsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/api/account")
    public ResponseEntity<Map<String, String>> getContact() {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("account no","121212121");
        returnMap.put("name", "security demo");
        return ResponseEntity.ok(returnMap);
    }
}
