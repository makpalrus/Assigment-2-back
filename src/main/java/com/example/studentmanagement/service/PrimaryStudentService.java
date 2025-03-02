package com.example.studentmanagement.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.model.Student;
import java.util.Collection;

@Service
@Primary
public class PrimaryStudentService implements StudentService {
    private final StudentRepository repository;

    public PrimaryStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }

    @Override
    public Student getStudent(Long id) {
        return repository.getStudent(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return repository.getAllStudents();
    }
}