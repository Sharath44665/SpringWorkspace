package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return repository.findAll() ;
    }

    @PostMapping("/students")
    public Student makePost( @RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping("/students/{sid}")
    public Student updateStudent(@PathVariable("sid") Integer id){
        return repository.findById(id).orElse(new Student());
    }

}   
