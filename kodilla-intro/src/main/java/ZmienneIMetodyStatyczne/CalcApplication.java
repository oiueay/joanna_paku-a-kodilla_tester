package ZmienneIMetodyStatyczne;

import ZmienneIMetodyStatyczne.Calculator;

public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of the Circle with radius 10 equals: " + area);
    }
}