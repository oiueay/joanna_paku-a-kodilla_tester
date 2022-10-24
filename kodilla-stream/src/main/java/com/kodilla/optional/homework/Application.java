package com.kodilla.optional.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Map<Student, Teacher> school = new HashMap<>();
        Student student1 = new Student("Brian Kowalski", new Teacher("Krystyna Kowalska"));
        Student student2 = new Student("Jessica Nowak", null);


        for (Map.Entry<Student, Teacher> studentEntry : school.entrySet()) {
            System.out.println("uczeń: " + studentEntry.getKey().getName() + ", nauczyciel: "
        + studentEntry.getValue().getName());}

    }
}
