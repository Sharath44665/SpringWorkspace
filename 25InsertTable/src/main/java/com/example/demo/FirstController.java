package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/students")
    public Student makePost( @RequestBody Student student){
        return repository.save(student);
    }

}   
