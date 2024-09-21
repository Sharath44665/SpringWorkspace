package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello from first controller";
    }

    @PostMapping("/post")
    public String makePost( @RequestBody String msg){
        return "request accepted, msg is: "+msg;
    }

    @PostMapping("/order")
    public String makeOrder(@RequestBody Order order){
        return "accepted! and object: "+order.toString();
    }


}
