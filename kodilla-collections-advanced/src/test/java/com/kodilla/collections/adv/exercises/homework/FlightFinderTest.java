package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FlightFinderTest {
    @Test
    void findFlightsFrom() {

        List<String> expected = List.of("KTW");

        FlightFinder flightFinder = new FlightFinder();

        String result = flightFinder.findFlightsFrom("KTW").toString();

        assertEquals(expected, result);
    }
}

