package com.company;

public class Teacher extends Human {
    Course course;
    public Teacher(String name, String surname, Course course) {
        super(name, surname);
        this.course = course;
    }
}

