package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;


@Configuration
public class CarFactory {

    @Bean
    public Car randomCar() {
        String season = getSeason(LocalDate.now());
        boolean lights = isNight(LocalTime.now());
        if (season.equals("Winter")) {
            return new SUV(lights);
        } else if (season.equals("Summer")) {
            return new Cabrio(lights);
        } else {
            return new Sedan(lights);
        }
    }

    public static boolean isNight(LocalTime time) {
        return (time.getHour() >= 20 || time.getHour() < 6);
    }

    public static String getSeason(LocalDate date) {
        if (date.getMonthValue() < 3) {
            return "Winter";
        } else if (date.getMonthValue() < 6) {
            return "Spring";
        } else if (date.getMonthValue() < 9) {
            return "Summer";
        } else {
            return "Autumn";
        }

    }
}
