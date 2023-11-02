package com.uallessonivo.restcrudservice.controllers;

import com.uallessonivo.restcrudservice.entities.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Luigi", "Verdi"));
        theStudents.add(new Student("Giovanni", "Bianchi"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }
}
