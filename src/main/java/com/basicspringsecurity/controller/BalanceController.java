package com.basicspringsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BalanceController {

    @GetMapping("/api/balance")
    public ResponseEntity<Map<String, String>> getContact() {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("account no","121212121");
        returnMap.put("name", "security demo");
        returnMap.put("current balance", "1212243");
        return ResponseEntity.ok(returnMap);
    }
}
