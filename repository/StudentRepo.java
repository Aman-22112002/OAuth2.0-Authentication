package com.Aman.Oauth2Security.repository;

import com.Aman.Oauth2Security.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    Student findByStudentId(Long studentId);

    Student findByStudentName(String studentName);
}
