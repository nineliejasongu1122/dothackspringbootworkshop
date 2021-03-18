package com.cs102.dothackSpringboot.entities;


import javax.persistence.*;
import java.util.Date;

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

    private Date CreateAt;

    private Date UpdateAt = null;

    @PrePersist
    public void logTime() {
        Date temp = new Date();
        Object param = new java.sql.Timestamp(temp.getTime());
        CreateAt = (Date) param;
    }

    @PreUpdate
    public void logUpdate() {
        Date temp = new Date();
        Object param = new java.sql.Timestamp(temp.getTime());
        UpdateAt = (Date) param;
    }
}
