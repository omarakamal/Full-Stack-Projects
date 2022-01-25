package com.example.studentms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")
public class Bootcamp {
    @Id
    @Column(name = "bootcampId")
    private int bootcampId;
    private String location;

//    @OneToMany(mappedBy = "bootcamp")
//    @JsonIgnore
//    private List<Student> items = new ArrayList<>();

//    @OneToOne(mappedBy = "bootcamp")
//    private Student student;

    @ManyToMany(mappedBy = "bootcamps")
    @JsonIgnore
    private List<Student> students = new ArrayList<>();

    public Bootcamp() {
    }

    public Bootcamp(int bootcampId, String location) {
        this.bootcampId = bootcampId;
        this.location = location;
    }


    //
//    public List<Student> getItems() {
//        return students;
//    }
//
//    public void setItems(List<Student> students) {
//        this.students = students;
//    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

//    public List<Student> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Student> items) {
//        this.items = items;
//    }

    public int getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}