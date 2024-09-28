package com.example.demo.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    private StudentMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new StudentMapper();
    }

    @Test
    public void shouldMapStudentDtoToStudent(){
        StudentDto dto = new StudentDto("john",
                "doe", "johndoe@email.com", 1);

        Student stud = mapper.toStudent(dto);

        assertEquals(dto.firstname(), stud.getFirstname());
        assertEquals(dto.lastname(), stud.getLastname());
        assertEquals(dto.email(), stud.getEmail());
        assertNotNull(stud.getSchool());
        assertEquals(dto.schoolId(), stud.getSchool().getId());
    }

}