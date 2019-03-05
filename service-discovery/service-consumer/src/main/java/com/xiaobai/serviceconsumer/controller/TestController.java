package com.xiaobai.serviceconsumer.controller;

import com.xiaobai.serviceconsumer.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private SayHelloService sayHelloService;
    @RequestMapping("/test")
    public String test(@RequestParam("name")String name){
        return sayHelloService.sayHello(name);
    }
}
