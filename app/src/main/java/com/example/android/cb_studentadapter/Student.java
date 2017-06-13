package com.example.android.cb_studentadapter;

/**
 * Created by lenovo on 6/13/2017.
 */

public class Student {
    String name;
    String course;

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }
}
