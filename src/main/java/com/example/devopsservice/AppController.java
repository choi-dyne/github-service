package com.example.devopsservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController 
public class AppController {
    @GetMapping("/")
    public String index() {
        return "GOOD DAY GODD!!! the end fianlly ~~~";
    }
    
}