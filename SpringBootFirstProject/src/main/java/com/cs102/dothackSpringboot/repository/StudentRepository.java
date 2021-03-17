package com.cs102.dothackSpringboot.repository;

import com.cs102.dothackSpringboot.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
