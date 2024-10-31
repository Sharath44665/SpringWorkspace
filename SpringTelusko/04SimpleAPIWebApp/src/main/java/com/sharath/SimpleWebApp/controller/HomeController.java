package com.sharath.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greeting() {
        return "Hello From Sharath";
    }

    @RequestMapping("/about")
    public String getAboutPage() {
        return "Hello From About page";
    }
}
