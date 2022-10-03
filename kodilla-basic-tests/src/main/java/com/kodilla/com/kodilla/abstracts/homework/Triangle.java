package com.kodilla.com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int h;

    public Triangle(int a, int b, int h) {
        super();
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public int getPerimeter() {
        return a * 3;
    }

    @Override
    public int getArea() {
        return (a * h / 2);
    }
}
