package com.xiaobai.serviceprovider.service.Impl;

import com.xiaobai.serviceprovider.service.SayHelloService;
import org.springframework.stereotype.Service;

@Service
public class SayHelloImpl implements SayHelloService {
    public String sayHello(String name){
        return "Hello " + name + "!";
    }
}
