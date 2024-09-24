package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public StudentResponseDto makePost( @RequestBody StudentDto studentdto){
        return  studentService.saveStudent(studentdto);
    }

    @GetMapping("/students")
    public List<StudentResponseDto> getAll(){

        return studentService.findAllStudents() ;
    }

    @GetMapping("/students/{sid}")
    public StudentResponseDto updateStudent(@PathVariable("sid") Integer id){
        return studentService.updateStudent(id);
    }

    @GetMapping("/students/search/{sname}")
    public List<StudentResponseDto> findStudentByName(@PathVariable("sname") String name){
        return studentService.findStudentByName(name);
    }

    @DeleteMapping("/student/d/{sid}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable("sid") Integer id){
        studentService.deleteStudent(id );
    }

}   
