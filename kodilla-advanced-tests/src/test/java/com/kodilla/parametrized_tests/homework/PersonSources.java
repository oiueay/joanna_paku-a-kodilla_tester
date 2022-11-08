package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;



public class PersonSources {
    static Stream<Arguments> provideBMI() {
        return Stream.of(
                Arguments.of( 43, 170),
                Arguments.of( 44, 170),
                Arguments.of( 53, 170),
                Arguments.of( 70, 170),
                Arguments.of( 85, 170),
                Arguments.of( 100, 170),
                Arguments.of( 115, 170),
                Arguments.of( 140, 170),
                Arguments.of( 165, 170),
                Arguments.of( 180, 170)

        );
    }
}
