package com.example.demo.school;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }


    @PostMapping("/create")
    public SchoolDto create(@RequestBody SchoolDto dto){
        return  schoolService.create(dto);
    }


    @GetMapping("/school/all")
    public List<SchoolDto> getAll(){
        return schoolService.getAll();
    }
}
