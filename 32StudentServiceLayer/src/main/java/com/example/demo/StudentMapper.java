package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentMapper  {
    // this is a service layer

    public Student toStudent(StudentDto dto){
        var student = new Student();
        student.setFirstname(dto.firstname());
        student.setLastname(dto.lastname());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());

        student.setSchool(school);
        return  student;
    }

    public StudentResponseDto toStudentResponseDto(Student studObj){
        return new StudentResponseDto(studObj.getFirstname(), studObj.getLastname(), studObj.getEmail());
    }
}
