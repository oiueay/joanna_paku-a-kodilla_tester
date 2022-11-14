package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonTest {

    Person bmi1 = new Person(170, 43);
    Person bmi2 = new Person(170, 44);
    Person bmi3 = new Person(170, 53);
    Person bmi4 = new Person(170, 70);
    Person bmi5 = new Person(170, 85);
    Person bmi6 = new Person(170, 100);
    Person bmi7 = new Person(170, 115);
    Person bmi8 = new Person(170, 130);
    Person bmi9 = new Person(170, 140);
    Person bmi10 = new Person(170, 165);
    Person bmi11 = new Person(170, 180);



    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideBMI")
    public void shouldProvideBMI(int height, int weight, String expectedBMI) {



        assertEquals(expectedBMI, bmi1.getBMI());
        assertEquals(expectedBMI, bmi2.getBMI());
        assertEquals(expectedBMI, bmi3.getBMI());
        assertEquals(expectedBMI, bmi4.getBMI());
        assertEquals(expectedBMI, bmi5.getBMI());
        assertEquals(expectedBMI, bmi6.getBMI());
        assertEquals(expectedBMI, bmi7.getBMI());
        assertEquals(expectedBMI, bmi8.getBMI());
        assertEquals(expectedBMI, bmi9.getBMI());
        assertEquals(expectedBMI, bmi10.getBMI());
        assertEquals(expectedBMI, bmi11.getBMI());
    }
}