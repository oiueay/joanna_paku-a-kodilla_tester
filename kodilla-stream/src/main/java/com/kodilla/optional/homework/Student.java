package com.kodilla.stream.homework;
import java.util.Optional;

public class Student {

    private String name;
    private Optional<Teacher> teacher;

    public Student(String name, Optional<Teacher> teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Optional<Teacher> getTeacher() {
        return teacher;
    }
}
