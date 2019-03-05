package com.xiaobai.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${message}")
    private String message;
    @RequestMapping("/config")
    public String config(){
        return message;
    }
}
