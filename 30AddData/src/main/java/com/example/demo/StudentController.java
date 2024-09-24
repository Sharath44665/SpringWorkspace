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
    public Student makePost( @RequestBody Student student){
        return repository.save(student);
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
