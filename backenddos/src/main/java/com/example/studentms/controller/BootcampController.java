package com.example.studentms.controller;

import com.example.studentms.model.Bootcamp;
import com.example.studentms.model.BootcampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "https://frontend-tuwaiq.herokuapp.com")
@RequestMapping(path = "api/bootcamp")
public class BootcampController {
    private BootcampService bootcampService;

    @Autowired
    public BootcampController(BootcampService bootcampService) {
        this.bootcampService = bootcampService;
    }

    @GetMapping
    public List<Bootcamp> getBootcamps() {
        return bootcampService.getBootcamps();
    }

    @PostMapping(path = "add")
    public void registerNewBootcamp(@RequestBody Bootcamp bootcamp){
        bootcampService.addNewBootcamp(bootcamp);
    }

}
