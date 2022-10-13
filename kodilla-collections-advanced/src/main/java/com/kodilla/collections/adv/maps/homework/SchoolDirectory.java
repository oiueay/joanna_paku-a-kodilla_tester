package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> school = new HashMap<>();
        Principal JanKowalski = new Principal("Jan", "Kowalski");
        Principal JanNowak = new Principal("Jan", "Nowak");
        Principal AnnaNowak = new Principal("Anna", "Nowak");
        Principal MariaKowalska = new Principal("Maria", "Kowalska");


        School PrimarySchool1 = new School(Arrays.asList(23.0, 22.0, 24.0, 25.0), "PrimarySchool1");
        School PrimarySchool2 = new School(Arrays.asList(28.0, 27.0, 30.0, 31.0), "PrimarySchool2");
        School SecondarySchool1 = new School(Arrays.asList(23.0, 22.0, 21.0), "SecondarySchool1");
        School SecondarySchool2 = new School(Arrays.asList(25.0, 26.0, 27.0), "SecondarySchool2");


        school.put(JanKowalski, PrimarySchool1);
        school.put(JanNowak, PrimarySchool2);
        school.put(AnnaNowak, SecondarySchool1);
        school.put(MariaKowalska, SecondarySchool2);


        for (Map.Entry<Principal, School> schoolEntry : school.entrySet()) {
            System.out.println(schoolEntry.getKey().getFirstname() + " " + schoolEntry.getKey().getLastname() + "," + " amount of students: "
                    + schoolEntry.getValue().getSum() + "," + schoolEntry.getValue().getSchoolName());
        }
    }
}
