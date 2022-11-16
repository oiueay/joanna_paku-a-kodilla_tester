package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.Scanner;

@Configuration
public class CarFactory {

    @Bean
    public Car randomCar() {
        Car car;
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        if (season == "Winter") {
            car = new SUV();
        } else if (season == "Summer") {
            car = new Cabrio();
        } else if (season == "Autumn" || season == "Spring") {
            car = new Sedan();
        } else {
            System.out.println("Type season of the year");
        }
        return car;
    }
}

