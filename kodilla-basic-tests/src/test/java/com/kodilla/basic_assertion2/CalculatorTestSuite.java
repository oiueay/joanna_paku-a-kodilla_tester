package com.kodilla.basic_assertion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double n = 2;
        double aa = -0.1;
        double aaa = 0;

        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);

        double exponentiationResult = calculator.exponentiation(a, n);
        assertEquals (25, exponentiationResult, 0.1);

        double exponentiationResult2 = calculator.exponentiation2(aa, n);
        assertEquals (-0.01, exponentiationResult2, 0.1);

        double exponentiationResult3 = calculator.exponentiation3(aaa, n);
        assertEquals (0, exponentiationResult3, 0.1);
    }
}
