package com.cs102.dothackSpringboot.Repository;

import com.cs102.dothackSpringboot.Entities.Course;
import com.cs102.dothackSpringboot.Entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {


}

