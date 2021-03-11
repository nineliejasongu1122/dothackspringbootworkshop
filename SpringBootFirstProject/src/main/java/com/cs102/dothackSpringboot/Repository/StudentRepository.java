package com.cs102.dothackSpringboot.Repository;

import com.cs102.dothackSpringboot.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
