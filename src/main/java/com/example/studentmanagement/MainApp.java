package com.example.studentmanagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.studentmanagement.config.AppConfig;
import com.example.studentmanagement.service.StudentService;
import com.example.studentmanagement.model.Student;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(new Student(1L, "John Doe", 20));

        System.out.println("Student: " + studentService.getStudent(1L).getName());

        context.getBean("reportGenerator"); // Тестируем ленивую инициализацию
        context.close();
    }
}
