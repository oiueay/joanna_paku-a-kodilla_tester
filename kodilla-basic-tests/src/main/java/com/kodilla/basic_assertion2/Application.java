package com.kodilla.basic_assertion2;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double n = 2;
        System.out.println(Math.pow(a, n));
        double aa = - 0.1;
        System.out.println(Math.pow(aa, n));
        double aaa = 0;
        System.out.println(Math.pow(aaa, n));

        int subtractResult = calculator.subtract(a, b);
        boolean correct2 = com.kodilla.basic_assertion.ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double exponentiationResult = calculator.exponentiation(a, n);
        boolean correct3 = ResultChecker.assertEquals(25, exponentiationResult, 0.1);
        if (correct3) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczb " + a + " i " + n);
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczb " + a + " i " + n);
        }

        double exponentiationResult2 = calculator.exponentiation(aa, n);
        boolean correct4 = ResultChecker.assertEquals(-0.01, exponentiationResult2, 0.1);
        if (correct4) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczb " + aa + " i " + n);
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczb " + aa + " i " + n);
        }

        double exponentiationResult3 = calculator.exponentiation(aaa, n);
        boolean correct5 = ResultChecker.assertEquals(0, exponentiationResult3, 0.1);
        if (correct5) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczb " + aaa + " i " + n);
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczb " + aaa + " i " + n);
        }
    }
}

