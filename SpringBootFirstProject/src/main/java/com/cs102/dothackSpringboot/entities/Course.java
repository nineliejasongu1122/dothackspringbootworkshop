package com.cs102.dothackSpringboot.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dothack_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cid;

    private String cname;

    @OneToMany(mappedBy = "course") //Same as the naming in Regisration table
    private Set<Registration> registrations;

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }
}
