package com.example.REST_APIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/api")
    public String callApi(){
        return "My First API Called !!!";
    }
}
