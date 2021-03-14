package com.cs102.dothackSpringboot.Repository;

import com.cs102.dothackSpringboot.Entities.Course;
import com.cs102.dothackSpringboot.Entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface CourseRepository extends CrudRepository<Course, Integer> {


}

