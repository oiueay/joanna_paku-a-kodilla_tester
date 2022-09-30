package com.kodilla.com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int a, int b, int h) {
        super(a, b, h);
    }

    @Override
    public int getPerimeter() {
        return 4 * getA();
    }

    @Override
    public int getArea() {
        return (int) Math.pow(getA(), getB());
    }
}
