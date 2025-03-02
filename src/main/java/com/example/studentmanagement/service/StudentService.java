package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import java.util.Collection;

public interface StudentService {
    void addStudent(Student student);
    Student getStudent(Long id);
    Collection<Student> getAllStudents();
}
