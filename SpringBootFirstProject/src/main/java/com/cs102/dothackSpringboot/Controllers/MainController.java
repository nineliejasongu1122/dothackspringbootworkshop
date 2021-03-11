package com.cs102.dothackSpringboot.Controllers;


import com.cs102.dothackSpringboot.Entities.Course;
import com.cs102.dothackSpringboot.Entities.MappingDTO;
import com.cs102.dothackSpringboot.Entities.Registration;
import com.cs102.dothackSpringboot.Entities.Student;
import com.cs102.dothackSpringboot.Repository.CourseRepository;
import com.cs102.dothackSpringboot.Repository.RegistrationRepository;
import com.cs102.dothackSpringboot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dothack")
public class MainController {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    RegistrationRepository rRepository;

    @GetMapping(path = "/student/list")
    public ResponseEntity<?> listStudent() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @PostMapping(path = "/student/add")
    public ResponseEntity<?> addStudent(@RequestBody String name) {
        Student s = new Student(name);
        return ResponseEntity.ok(studentRepository.save(s));
    }

    @GetMapping(path = "/course/list")
    public ResponseEntity<?> listCourse() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @PostMapping(path = "/course/add")
    public ResponseEntity<?> addCorse(@RequestBody String cname) {
        Course s = new Course(cname);
        return ResponseEntity.ok(courseRepository.save(s));
    }

    @GetMapping(path = "/registration/list")
    public ResponseEntity<?> listRegistration() {
        return ResponseEntity.ok(rRepository.findAll());
    }

    @PostMapping(path = "/registration/map")
    public ResponseEntity<?> register(@RequestBody MappingDTO mDTO) {
        Registration r = new Registration();
        r.setCourse(courseRepository.findById(mDTO.getCid()).get());
        r.setStudent(studentRepository.findById(mDTO.getSid()).get());
        r.setSemester(mDTO.getSemester());
        return ResponseEntity.ok(rRepository.save(r));
    }


    @GetMapping(path = "/registration/listbycourse/{name}")
    public ResponseEntity listByCourseName (@PathVariable String name){
        return null;
    }

}
