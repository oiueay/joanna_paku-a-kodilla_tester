package com.kodilla.com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(int a, int b, int h) {
        super(a, b, h);
    }

    @Override
    public int getPerimeter() {
        return getA() * 3;
    }

    @Override
    public int getArea() {
        return (getA() * getH()) / 2;
    }
}
