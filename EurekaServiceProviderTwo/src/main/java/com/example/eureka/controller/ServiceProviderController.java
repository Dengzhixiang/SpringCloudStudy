package com.example.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello" + name + ", this is two message";
    }

}
