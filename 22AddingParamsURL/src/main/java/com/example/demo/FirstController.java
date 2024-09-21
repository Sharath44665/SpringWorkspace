package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
//    @GetMapping("/hello")
//    public String Hello(){
//        return "Hello from first controller";
//    }

    @PostMapping("/post")
    public String makePost( @RequestBody String msg){
        return "request accepted, msg is: "+msg;
    }

    @PostMapping("/order")
    public String makeOrder(@RequestBody Order order){
        return "accepted! and object: "+order.toString();
    }

    @PostMapping("/order-record")
    public String makeOrderRecord(@RequestBody OrderRecord order){
        return "accepted! and object: "+order.toString();
    }

    @GetMapping("/hello/{demo_name}")
    public String getPathName(@PathVariable("demo_name") String demoName){
        return "you have added: "+ demoName;
    }

                    // http://localhost:8080/hello?first=sharath&last=chandra
    @GetMapping("/hello")
    public String getParamsVars(@RequestParam("first") String firstname,
                                @RequestParam("last") String lastName){
        return "Your full name is: "+firstname+ " "+lastName;
    }
}
