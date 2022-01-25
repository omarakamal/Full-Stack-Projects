package com.example.studentms.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface StudentRepository
    extends JpaRepository<Student, Integer> {
}
