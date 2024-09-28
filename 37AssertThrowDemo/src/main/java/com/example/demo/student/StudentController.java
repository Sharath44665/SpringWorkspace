package com.example.demo.student;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public StudentResponseDto makePost( @Valid @RequestBody StudentDto studentdto){
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exp){
        var errors =  new HashMap<String, String>();
        exp.getBindingResult().getAllErrors()
                .forEach(error -> {
                    var fieldName = ((FieldError)error).getField();
                    var errorMsg = error.getDefaultMessage();

                    errors.put(fieldName, errorMsg);
                });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}   
