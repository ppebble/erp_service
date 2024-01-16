package com.erp.registry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
    @GetMapping("/api/hello")
    public String test(){
        return "hello, world";
    }
}
