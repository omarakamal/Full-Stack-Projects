package com.example.studentms.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class StudentServiceTest {
    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetStudents() {
        List<Student> result = studentService.getStudents();
        Assertions.assertEquals(Arrays.<Student>asList(new Student(0, "name", "email", Arrays.<Bootcamp>asList(new Bootcamp(0, "location")))), result);
    }

    @Test
    void testGetStudent() {
        Optional<Student> result = studentService.getStudent(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewStudent() {
        studentService.addNewStudent(new Student(0, "name", "email", Arrays.<Bootcamp>asList(new Bootcamp(0, "location"))));
    }

    @Test
    void testDeleteStudent() {
        studentService.deleteStudent(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme