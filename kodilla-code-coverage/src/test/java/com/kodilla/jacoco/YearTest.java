package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
     void shouldBeLeapYearIfDivisibleBy4AndNotDivisibleBy100() {
        Year year = new Year(88);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
     void shouldNotBeLeapYearIfDivisibleBy4AndDivisibleBy100AndNotDivisibleBy400() {
        Year year = new Year(100);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
     void shouldNotBeLeapYearIfNotDivisibleBy4(){
        Year year = new Year(75);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}