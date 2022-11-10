package com.kodilla.optional.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Brian Kowalski", new Teacher("Krystyna Kowalska")));
        students.add(new Student("Jessica Nowak", null));



        for (Student student: students ){
            String teacher = (student.getTeacher().isPresent())? student.getTeacher().get().getName() :"undefined";
            System.out.println("uczeń: " + student.getName() + " nauczyciel: " + teacher);
        }
    }
}
