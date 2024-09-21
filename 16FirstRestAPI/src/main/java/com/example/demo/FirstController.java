package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello from first controller";
    }

    @GetMapping("/welcome")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String welcome(){
        return "<h1>Welcome from first controller</h1>";
    }
}
