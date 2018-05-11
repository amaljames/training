package com.example.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @GetMapping("/hi")
    public String hello(){
        return "hello";
    }
}
