package com.uallessonivo.restcrudservice.controllers;

import com.uallessonivo.restcrudservice.entities.Student;
import com.uallessonivo.restcrudservice.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= theStudents.size() || studentId < 0)
            throw new StudentNotFoundException("Student id not found - " + studentId);

        return theStudents.get(studentId);
    }
}
