package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonTest {

    Person bmi1 = new Person(170, 43);



    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideBMI")
    public void shouldProvideBMI(int height, int weight, String expectedBMI) {

        assertEquals(expectedBMI, bmi1.getBMI());
    }
}