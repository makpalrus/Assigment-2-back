package com.example.studentmanagement.singleton;

import org.springframework.stereotype.Component;

@Component
public class AttendanceAnalyzer {
    public AttendanceAnalyzer() {
        System.out.println("AttendanceAnalyzer initialized eagerly");
    }
}