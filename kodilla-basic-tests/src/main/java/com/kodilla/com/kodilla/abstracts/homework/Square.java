package com.kodilla.com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int a;

    public Square(int a) {
        super();
        this.a = a;
    }

    @Override
    public int getPerimeter() {
        return 4 * a;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(a, a);
    }
}
