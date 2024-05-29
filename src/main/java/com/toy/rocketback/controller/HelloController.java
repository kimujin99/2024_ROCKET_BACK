package com.toy.rocketback.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World 비상탈출로켓입니다!";
    }

}
