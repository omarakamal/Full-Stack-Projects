package com.example.studentms.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BootcampService {
    private BootcampRepository bootcampRepository;

    @Autowired
    public BootcampService(BootcampRepository bootcampRepository) {
        this.bootcampRepository = bootcampRepository;
    }


    public List<Bootcamp> getBootcamps() {
        return bootcampRepository.findAll();
    }

    public void addNewBootcamp(Bootcamp bootcamp) {
        bootcampRepository.save(bootcamp);
    }
}
