package com.kodilla.abstracts.homework2;

public class Person {

    String firstName;
    int age;
    String job;

    Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void responsibilities(Job job) {
        System.out.println(job.getResponsibilities());
    }
}

