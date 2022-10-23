package com.kodilla.stream.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        Student student1 = new Student("Brian Kowalski", Optional.ofNullable(new Teacher("Jan Nowak")));
        Student student2 = new Student("Jessica Nowak", null);
        student.add(student1);
        student.add(student2);



     //   Optional<Map<Student, Teacher>> optionalUser = Optional.ofNullable(school);

    }


}
/// Przyporządkowanie jest poprzez wpisanie uczniowi nauczyciela - przez konstruktor właśnie
//potrzebujesz listę uczniów
//niektórzy będą mieli wpisanego nauczyciela, a niektórym ustaw
//null