package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideBMI() {
        return Stream.of(
                Arguments.of(  1.7, 43,"Very severely underweight"),
                Arguments.of(  1.7, 44,"Severely underweight"),
                Arguments.of(  1.7, 53,"Underweight"),
                Arguments.of(  1.7, 70,"Normal (healthy weight)"),
                Arguments.of(  1.7, 85,"Overweight"),
                Arguments.of(  1.7, 100,"Obese Class I (Moderately obese)"),
                Arguments.of(  1.7, 115,"Obese Class II (Severely obese)"),
                Arguments.of(  1.7, 130,"Obese Class III (Very severely obese)"),
                Arguments.of(  1.7, 140,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(  1.7, 165,"Obese Class V (Super Obese)"),
                Arguments.of(  1.7, 180,"Obese Class VI (Hyper Obese)")
        );
    }
}
