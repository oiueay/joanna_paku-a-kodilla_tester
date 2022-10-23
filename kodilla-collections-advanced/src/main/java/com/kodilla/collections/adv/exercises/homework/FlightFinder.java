package com.kodilla.collections.adv.exercises.homework;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public static void main(String[] args) {
        List<String> FlightsFrom = findFlightsFrom("MIA");
        System.out.println(FlightsFrom);
    }

    private static List<String> findFlightsFrom(String departure) {
        List<Flight> nameofdeparture = FlightRepository.getFlightsTable()
                .stream()
                .filter((f -> f.getDeparture().equals("MIA")));
                .map(Flight :: getDeparture)
                .collect(Collectors.toList());
        return nameofdeparture;
    }

    public static String getDeparture(Flight departure) {
        return departure.getDeparture();
    }
}





