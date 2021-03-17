package com.cs102.dothackSpringboot.repository;

import com.cs102.dothackSpringboot.entities.Course;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface CourseRepository extends CrudRepository<Course, Integer> {


}

