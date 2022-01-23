package com.example.relationships.manytomany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "courseList")
    private List<Student> studentList;

    public Course(String name) {
        this.name = name;
        this.studentList = studentList=new ArrayList<>();
    }
}
