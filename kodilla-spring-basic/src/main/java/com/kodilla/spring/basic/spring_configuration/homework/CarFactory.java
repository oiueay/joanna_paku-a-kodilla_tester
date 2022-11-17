package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class CarFactory {

    @Bean
    public Car randomCar() {
        Car car;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter season of the year:");
            String season = scanner.nextLine().trim();
            if (season == "Winter") {
                return car = new SUV();
            } else if (season == "Summer") {
                return car = new Cabrio();
            } else if (season == "Autumn" || season == "Spring") {
                return car = new Sedan();
            }
            System.out.println("Enter correct season of the year");
        }
    }
}
