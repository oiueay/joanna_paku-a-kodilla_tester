package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        return List.of(
                new Flight("KTW", "MIA"),
                new Flight("WAW", "MIA"),
                new Flight("WAW", "KTW"));
    }
}

