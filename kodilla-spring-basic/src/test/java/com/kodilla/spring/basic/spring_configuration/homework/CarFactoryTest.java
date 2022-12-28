package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CarFactoryTest {

    @Autowired
    private Car car;

    @Test
    void shouldCreateCar() {
        String season = CarFactory.getSeason(LocalDate.now());
        if (season.equals("Winter"))
            assertTrue(car instanceof SUV);
        else if (season.equals("Spring"))
            assertTrue(car instanceof Sedan);
        else if (season.equals("Summer"))
            assertTrue(car instanceof Cabrio);
    }

    @Test
    public void shouldReturnTrueWhenTimeIsBetween20And6() {
        boolean isNight = CarFactory.isNight(LocalTime.now());
        assertEquals(isNight, car.hasHeadlightsTurnedOn());
    }
}