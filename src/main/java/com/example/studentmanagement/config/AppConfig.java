package com.example.studentmanagement.config;

import com.example.studentmanagement.singleton.AttendanceAnalyzer;
import com.example.studentmanagement.singleton.ReportGenerator;
import org.springframework.context.annotation.*;
import com.example.studentmanagement.service.*;
import com.example.studentmanagement.repository.*;
import com.example.studentmanagement.model.*;
import com.example.studentmanagement.service.*;


@Configuration
@ComponentScan("com.example.studentmanagement")
public class AppConfig {
    @Bean
    public AttendanceAnalyzer attendanceAnalyzer() {
        return new AttendanceAnalyzer();
    }

    @Bean
    @Lazy
    public ReportGenerator reportGenerator() {
        return new ReportGenerator();
    }
}
