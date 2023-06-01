package com.Steven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlle {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello Maven");
        return "Hello maven";
    }
}
