package com.example.demo.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "Firstname is missing or empty")
        String firstname,

        @NotEmpty(message = "lastname is missing or empty")
        String lastname,
        String email,
        Integer schoolId) {

}
