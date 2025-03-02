package com.example.studentmanagement.model;

public class Course {
    private Long id;
    private String title;

    public Course(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
}