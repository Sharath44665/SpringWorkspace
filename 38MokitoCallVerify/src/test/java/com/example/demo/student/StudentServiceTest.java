package com.example.demo.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    // which service
    @InjectMocks
    private StudentService studentService;
    @Mock
    private  StudentRepository repository;

    @Mock
    private  StudentMapper studentMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void should_successfully_save_a_student(){
        // given
        StudentDto dto = new StudentDto(
                "kevin", "c", "kevinc@example.com", 1
        );

        Student student = new Student(
                "kevin", "c", "kevinc@example.com", 19
        );
        Student savedStudent = new Student(
                "kevin", "c", "kevinc@example.com", 19
        );
        savedStudent.setId(1);
        // mock the calls
//        Mockito.when(studentMapper.toStudent(dto)).thenReturn(student);
        when(studentMapper.toStudent(dto)).thenReturn(student); // as this is a static
        when(repository.save(student)).thenReturn(savedStudent);
        when(studentMapper.toStudentResponseDto(savedStudent)).thenReturn(
                new StudentResponseDto("kevin","c","kevinc@example.com"));
        // when

        StudentResponseDto responseDto = studentService.saveStudent(dto);

        // then
        assertEquals(dto.firstname(), responseDto.firstname());
        assertEquals(dto.lastname(), responseDto.lastname());
        assertEquals(dto.email(),responseDto.email());

        // calling repository.save(stud); only one time:
        verify(studentMapper, times(1)).toStudent(dto);
        verify(repository, times(1)).save(student);
        verify(studentMapper, times(1)).toStudentResponseDto(savedStudent);
    }

    @Test
    public void should_find_all_students(){
        // given
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(
                new Student("kevin", "c", "kevinc@example.com", 19));

        // mock calls
        when(repository.findAll()).thenReturn(allStudents);
        when(studentMapper.toStudentResponseDto(any(Student.class))).thenReturn(
                new StudentResponseDto("kevin", "c", "kevinc@example.com")
        );

        // when
        List<StudentResponseDto> responseDtos =  studentService.findAllStudents();
        // then
        assertEquals(allStudents.size(), responseDtos.size());
        verify(repository, times(1)).findAll();
    }

    @Test
    public void should_update_student(){
        // given
        Student student = new Student(
                "kevin", "c", "kevinc@example.com", 19);
        student.setId(1);
        // mock callls
        when(repository.findById(student.getId())).thenReturn(Optional.of(student));
        when(studentMapper.toStudentResponseDto(any(Student.class))).thenReturn(
                new StudentResponseDto("kevin", "c", "kevinc@example.com")
        );
        // when
        StudentResponseDto responseDto = studentService.updateStudent(student.getId());
        // then
        assertEquals(student.getFirstname(), responseDto.firstname());
        assertEquals(student.getLastname(), responseDto.lastname());
        assertEquals(student.getEmail(),responseDto.email());

        verify(repository, times(1)).findById(student.getId());
    }

    @Test
    public void should_find_by_name(){
        //given
        String name = "kevin";
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(
                new Student("kevin", "c", "kevinc@example.com", 19));

        //mock calls
        when(repository.findAllByFirstnameLike(name))
                .thenReturn(allStudents);
        when(studentMapper.toStudentResponseDto(any(Student.class))).thenReturn(
                new StudentResponseDto("kevin", "c", "kevinc@example.com")
        );
        // when
        var responseDtos =  studentService.findStudentByName(name);
        // then
        assertEquals(responseDtos.size(),allStudents.size());

        verify(repository, times(1)).findAllByFirstnameLike(name);
    }
}