package com.xiaobai.serviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-provider")
public interface SayHelloService {
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name")String name);
}
