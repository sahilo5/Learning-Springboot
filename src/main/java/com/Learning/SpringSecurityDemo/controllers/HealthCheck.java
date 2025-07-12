package com.Learning.SpringSecurityDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/public/health")
    public String healthCheck() {
        return "Service is up and running!";
    }
}
