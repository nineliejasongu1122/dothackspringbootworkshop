package com.cs102.dothackSpringboot.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "dothack_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;

    private String sname;

    @OneToMany(mappedBy = "student") //Same as the naming in Regisration table
    private Set<Registration> registration;

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }
}

