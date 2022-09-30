package com.kodilla.com.kodilla.abstracts.homework2;

public class Application {

    public static void main(String[] args) {

        Job teacher = new Teacher();
        Job nurse = new Nurse();
        Job architect = new Architect();

        Person person = new Person("Kate", 35, "teacher");
        System.out.println("Kate's responsibillities:");
        person.responsibilities(teacher);

        Person person2 = new Person("Meg", 23, "nurse");
        System.out.println("Meg's responsibillities:");
        person.responsibilities(nurse);

        Person person3 = new Person ("Ana", 37, "architect");
        System.out.println("Ana's responsibillities:");
        person.responsibilities(architect);

    }
}
