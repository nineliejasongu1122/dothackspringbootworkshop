package com.cs102.dothackSpringboot.Entities;


import javax.persistence.*;

@Entity
@Table(name = "dothack_registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rid;

    @ManyToOne
    @JoinColumn(name = "sid") // Student id
    private Student student;

    @ManyToOne
    @JoinColumn(name = "cid") // alert id
    private Course course;

    private String semester;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
