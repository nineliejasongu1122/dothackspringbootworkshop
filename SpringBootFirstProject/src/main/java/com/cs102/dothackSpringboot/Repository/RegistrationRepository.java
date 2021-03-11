package com.cs102.dothackSpringboot.Repository;

import com.cs102.dothackSpringboot.Entities.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

}
