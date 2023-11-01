package com.uallessonivo.restcrudservice.controllers;

import com.uallessonivo.restcrudservice.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Luigi", "Verdi"));
        theStudents.add(new Student("Giovanni", "Bianchi"));

        return theStudents;
    }
}
