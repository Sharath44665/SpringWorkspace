package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstnameLike(String firstname); // or using findAllByFirstnameContaining()
}
