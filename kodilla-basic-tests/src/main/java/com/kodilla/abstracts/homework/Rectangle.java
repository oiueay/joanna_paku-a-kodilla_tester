package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public int getPerimeter() {

        return 4 * a;
    }

    @Override
    public int getArea() {
        return a * b;
    }
}