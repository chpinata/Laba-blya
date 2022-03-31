package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Human{
    HashMap <Course, Integer> courseMarks;

    public Student(String name, String surname, HashMap <Course, Integer> courseMarks ) {
        super(name, surname);
        this.courseMarks = courseMarks;
    }
}
