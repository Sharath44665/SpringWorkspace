package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }


    @PostMapping("/create")
    public School create(@RequestBody School school){
        return schoolRepository.save(school);
    }

                    @GetMapping("/all")
    public List<School> getAll(){
        return schoolRepository.findAll();
    }
}
