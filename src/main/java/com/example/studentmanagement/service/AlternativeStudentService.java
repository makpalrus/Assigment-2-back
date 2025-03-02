
package com.example.studentmanagement.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.model.Student;
import java.util.Collection;

@Service
@Qualifier("alternativeService")
public class AlternativeStudentService implements StudentService {
    private final StudentRepository repository;

    public AlternativeStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addStudent(Student student) {
        System.out.println("Adding student in alternative way");
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