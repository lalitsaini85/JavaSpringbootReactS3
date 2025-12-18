package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService studentService) {
        service = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }
}