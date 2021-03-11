package com.cs102.dothackSpringboot.Repository;

import com.cs102.dothackSpringboot.Entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}

