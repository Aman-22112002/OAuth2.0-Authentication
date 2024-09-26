package com.Aman.Oauth2Security.controller;

import com.Aman.Oauth2Security.entity.Student;
import com.Aman.Oauth2Security.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return "Added";
    }

    @GetMapping("/students")
    public List<Student> printStudents()
    {
        return studentService.printStudents();
    }

    @GetMapping("/student")
    public Student fetchStudentByName(String studentName)
    {
        return studentService.fetchStudentByName(studentName);
    }

}
