package com.example.studentms.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootcampRepository
        extends JpaRepository<Bootcamp, Integer>{
}
