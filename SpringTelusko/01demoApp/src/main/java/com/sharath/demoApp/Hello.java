package com.sharath.demoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greeting() {
//        System.out.println("Hello World");
        return "Hello World, welcome from sharath";

    }
}
