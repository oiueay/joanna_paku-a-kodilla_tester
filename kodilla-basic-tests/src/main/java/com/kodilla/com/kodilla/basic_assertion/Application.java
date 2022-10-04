package com.kodilla.com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int n = 2;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int somethingResult = calculator.exponentiation(a, n);
        boolean correct3 = ResultChecker.assertEquals(25, somethingResult);
        if (correct2) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczb " + a + " i " + n);
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczb " + a + " i " + n);
        }
    }
}
