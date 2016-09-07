package com.ifox.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {
    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return "good";
    }
}
