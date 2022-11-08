package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideBMI() {
        return Stream.of(
                Arguments.of( 43, 170, "Very severely underweight"),
                Arguments.of( 44, 170, 15.22),
                Arguments.of( 53, 170, 18.34),
                Arguments.of( 70, 170, 24.22),
                Arguments.of( 85, 170, 29.41),
                Arguments.of( 100, 170, 34.6),
                Arguments.of( 115, 170, 39.79),
                Arguments.of( 130, 170, 44.98),
                Arguments.of( 140, 170, 48.44),
                Arguments.of( 165, 170, 57.09),
                Arguments.of( 180, 170, 62.28)
        );
    }
}
