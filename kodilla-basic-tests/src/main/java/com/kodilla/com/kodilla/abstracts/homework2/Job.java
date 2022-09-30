package com.kodilla.com.kodilla.abstracts.homework2;

public abstract class Job {

    private int salary;
    private String responsibilities;


    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }


    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}

//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
// Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
// W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
// Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.