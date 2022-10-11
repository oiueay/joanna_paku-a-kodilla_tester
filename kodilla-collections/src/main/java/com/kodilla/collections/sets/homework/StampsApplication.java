package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Znaczek 1", "2/3"));
        stamps.add(new Stamp("Znaczek 1", "2/3"));
        stamps.add(new Stamp("Znaczek 1", "2/3"));
        stamps.add(new Stamp("Znaczek 2", "2/4"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) ;
        System.out.println(stamps);
    }
}
