package com.prajwal.etm_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    int visitors= 0;
    @GetMapping("api/hello")
    public String hello(){
        visitors++;
        return "Hello, Enterprise TaskMaster \nVisitors: "+visitors;
    }
}
