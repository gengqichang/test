package com.mr.provider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    public String hi(String name){
        return "hi " + name + " , port in " + port;
    }

}
