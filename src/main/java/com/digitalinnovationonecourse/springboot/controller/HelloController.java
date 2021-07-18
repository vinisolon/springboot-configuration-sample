package com.digitalinnovationonecourse.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@GetMapping("/")
    public String helloMessage() {
        return "De novo isso de hello world véi...";
    }
}
