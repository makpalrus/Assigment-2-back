package com.example.studentmanagement.repository;

import org.springframework.stereotype.Repository;
import com.example.studentmanagement.model.Student;
import java.util.*;

@Repository
public class StudentRepository {
    private final Map<Long, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(Long id) {
        return students.get(id);
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }
}
