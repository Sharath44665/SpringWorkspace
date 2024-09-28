package com.example.demo.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    private StudentMapper mapper, mapObjTwo;

    @BeforeEach
    void setUp() {
        mapper = new StudentMapper();
        mapObjTwo = new StudentMapper();

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


    @Test
    public void shouldMapStudentToStudentResponseDto(){

        // given
        Student myStudent = new Student("Mona", "lisa", "monalisa@example.com", 22);
//        myStudent.setFirstname("Mona");
//        myStudent.setLastname("lisa");
//        myStudent.setEmail("monalisa@example.com");

        // when
        StudentResponseDto studDto = mapper.toStudentResponseDto(myStudent);
        // then
        assertEquals(myStudent.getFirstname(), studDto.firstname());
        assertEquals(myStudent.getLastname(), studDto.lastname());
        assertEquals(myStudent.getEmail(), studDto.email());
    }

    @Test
    public void should_throw_null_pointer_exception_when_studentDto_is_null(){
        var exp =assertThrows(NullPointerException.class, () -> mapper.toStudent(null));
        assertEquals("Hello, raised exception and Dto is null...",exp.getMessage());
    }
}