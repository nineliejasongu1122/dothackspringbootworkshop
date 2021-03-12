package com.cs102.dothackSpringboot.Repository;

import com.cs102.dothackSpringboot.Entities.Course;
import com.cs102.dothackSpringboot.Entities.Registration;
import com.cs102.dothackSpringboot.Entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
    @Async
    @Query("SELECT r.student from Registration r WHERE r.course.cname = :name")
    List<Student> findAllStudentByCourseName(String name);

    @Async
    @Query("SELECT r.course from Registration r WHERE r.student.sname = :name")
    List<Course> findAllCourseByStudentName(String name);
}
