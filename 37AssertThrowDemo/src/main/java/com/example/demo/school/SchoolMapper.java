package com.example.demo.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    public School toSchool(SchoolDto dto){
        var myschool = new School();
        myschool.setName(dto.name());
        return  myschool;
    }

    public SchoolDto toSchoolDto(School schoolObj){
        return  new SchoolDto(schoolObj.getName());
    }

}
