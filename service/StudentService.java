package com.Aman.Oauth2Security.service;

import com.Aman.Oauth2Security.entity.Student;
import com.Aman.Oauth2Security.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> printStudents() {
        return studentRepo.findAll();
    }

    public Student fetchStudentById(Long studentId) {
        return studentRepo.findByStudentId(studentId);
    }

    public Student fetchStudentByName(String studentName)
    {
        return studentRepo.findByStudentName(studentName);
    }
}
