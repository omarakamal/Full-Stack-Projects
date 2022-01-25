package com.example.studentms.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class BootcampServiceTest {
    @Mock
    BootcampRepository bootcampRepository;
    @InjectMocks
    BootcampService bootcampService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetBootcamps() {
        List<Bootcamp> result = bootcampService.getBootcamps();
        Assertions.assertEquals(Arrays.<Bootcamp>asList(new Bootcamp(0, "location")), result);
    }

    @Test
    void testAddNewBootcamp() {
        bootcampService.addNewBootcamp(new Bootcamp(0, "location"));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme