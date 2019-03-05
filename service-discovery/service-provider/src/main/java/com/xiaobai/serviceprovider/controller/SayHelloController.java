package com.xiaobai.serviceprovider.controller;

import com.xiaobai.serviceprovider.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @Autowired
    private SayHelloService sayHelloService;
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name")String name){
        return sayHelloService.sayHello(name);
    }
}
