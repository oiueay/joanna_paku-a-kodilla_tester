package com.kodilla.com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int a, int b, int h) {

        super(a, b, h);
    }

    @Override
    public int getPerimeter() {
        return 4 * getA();
    }

    @Override
    public int getArea() {
        return getA() * getB();
    }
}