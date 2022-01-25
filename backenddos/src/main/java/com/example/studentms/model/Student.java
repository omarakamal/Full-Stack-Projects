package com.example.studentms.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private String email;

//    @ManyToOne
//    @JoinColumn(name = "bootcamp_id",referencedColumnName="bootcampId")
//    private Bootcamp bootcamp;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "bootcamp_id")
//    private Bootcamp bootcamp;
//, referencedColumnName = "bootcampId"
    //, referencedColumnName = "id"

    @ManyToMany
    @JoinTable(name = "student_bootcamp",
            joinColumns = @JoinColumn(name = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "bootcampId"))
    private List<Bootcamp> bootcamps;

    public Student(int id, String name, String email, List<Bootcamp> bootcamps) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bootcamps = bootcamps;
    }

    public Student() {
    }


//    public Student(int id, String name, String email, Bootcamp bootcamp) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.bootcamp = bootcamp;
//    }


//    public Student(int id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }


//    public Bootcamp getBootcamp() {
//        return bootcamp;
//    }
//
//    public void setBootcamp(Bootcamp bootcamp) {
//        this.bootcamp = bootcamp;
//    }


    public List<Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public void setBootcamps(List<Bootcamp> bootcamps) {
        this.bootcamps = bootcamps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}