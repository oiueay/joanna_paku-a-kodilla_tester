package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideBMI() {
        return Stream.of(
                Arguments.of(  170, 43,"Very severely underweight"),
                Arguments.of(  170, 44,"Severely underweight"),
                Arguments.of(  170, 53,"Underweight"),
                Arguments.of(  170, 70,"Normal (healthy weight)"),
                Arguments.of(  170, 85,"Overweight"),
                Arguments.of(  170, 100,"Obese Class I (Moderately obese)"),
                Arguments.of(  170, 115,"Obese Class II (Severely obese)"),
                Arguments.of(  170, 130,"Obese Class III (Very severely obese)"),
                Arguments.of(  170, 140,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(  170, 165,"Obese Class V (Super Obese)"),
                Arguments.of(  170, 180,"Obese Class VI (Hyper Obese)")
        );
    }
}
