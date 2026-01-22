package com.example.schoolmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/api/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to School Manager API");
        response.put("status", "Server is running");
        response.put("version", "1.0.0");
        return response;
    }

    @GetMapping("/test")
    public Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Test endpoint working!");
        response.put("status", "success");
        response.put("timestamp", System.currentTimeMillis() + "");
        return response;
    }
}
