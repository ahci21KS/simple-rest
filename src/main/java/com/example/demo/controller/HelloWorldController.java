package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/h")
    public String hello() {
        return "Hi-";
    }
    @GetMapping("/h2")
    public String hello2() {
        return "Hi-2";
    }
    @GetMapping("/h3")
    public String hello3() {
        return "Hi-3";
    }
}