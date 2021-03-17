package com.cs102.dothackSpringboot.entities;


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

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }
}
