package com.kodilla.com.kodilla.abstracts.homework;

public class Square extends Shape {

    int a = 2;
    int b = 2;

    public Square() {
        super();
    }

    @Override
    public int getPerimeter() {
        return 4 * a;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(a, b);
    }
}
