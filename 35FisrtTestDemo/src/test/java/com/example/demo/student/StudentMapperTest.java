package com.example.demo.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    @BeforeEach
    void setUp() {
        System.out.println("inside before each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("inside before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("inside after all");
    }

    @AfterEach
    void tearDown() {
        System.out.println("inside after each");
    }

    @Test
    public void firstTest(){
        System.out.println("my first test method");
    }

    @Test
    public void secondTest(){
        System.out.println("my second test method");
    }

}