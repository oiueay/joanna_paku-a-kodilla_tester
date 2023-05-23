package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
        } catch (AirportNotFoundException e) {
            System.out.println("Vienna status: " + isViennaInUse);
        }
        System.out.println("Thank you for using Kodilla Airlines");
    }
}
