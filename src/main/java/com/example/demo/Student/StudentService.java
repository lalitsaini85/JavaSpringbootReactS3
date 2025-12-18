package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        Student mariam = new Student("Mariam",
                1,
                21,
                "mariam@gmail.com");

        Student alex = new Student("Alex",
                2,
                22,
                "alex@gmail.com");

        return List.of(mariam, alex);
    }
}
