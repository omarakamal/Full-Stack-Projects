package com.example.Serverside.controller;

import com.example.Serverside.model.Employee;
import com.example.Serverside.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class EmployeeControllerTest {
    @Mock
    EmployeeRepository employeeRepository;
    @InjectMocks
    EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAllEmployees() {
        List<Employee> result = employeeController.getAllEmployees();
        Assertions.assertEquals(Arrays.<Employee>asList(new Employee(0, "firstName", "lastName", "department", "pic", "pic2")), result);
    }

    @Test
    void testCreateEmployee() {
        Employee result = employeeController.createEmployee(new Employee(0, "firstName", "lastName", "department", "pic", "pic2"));
        Assertions.assertEquals(new Employee(0, "firstName", "lastName", "department", "pic", "pic2"), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme