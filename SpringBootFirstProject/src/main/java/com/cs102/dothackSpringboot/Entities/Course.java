package com.cs102.dothackSpringboot.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "dothack_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cid;

    private String cname;

    public Course(String cname) {
        this.cname = cname;
    }

    @OneToMany(mappedBy = "course") //Same as the naming in Regisration table
    private Set<Registration> registrations;
}
