package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return repository.findAll() ;
    }

    @PostMapping("/students")
    public StudentResponseDto makePost( @RequestBody StudentDto studentdto){

        var stud = toStudent(studentdto);
        var savedStudent = repository.save(stud);
        return toStudentResponseDto(savedStudent);
    }

    private StudentResponseDto toStudentResponseDto(Student studObj){
        return new StudentResponseDto(studObj.getFirstname(), studObj.getLastname(), studObj.getEmail());
    }

    private Student toStudent(StudentDto dto){
        var student = new Student();
        student.setFirstname(dto.firstname());
        student.setLastname(dto.lastname());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());

        student.setSchool(school);
        return  student;
    }

    @GetMapping("/students/{sid}")
    public Student updateStudent(@PathVariable("sid") Integer id){
        return repository.findById(id).orElse(new Student());
    }

    @GetMapping("/students/search/{sname}")
    public List<Student> findStudentByName(@PathVariable("sname") String name){
        return repository.findAllByFirstnameLike(name);
    }

    @DeleteMapping("/student/d/{sid}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable("sid") Integer id){
        repository.deleteById(id );
    }

}   
