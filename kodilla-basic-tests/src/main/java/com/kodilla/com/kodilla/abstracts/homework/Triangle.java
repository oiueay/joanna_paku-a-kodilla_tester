package com.kodilla.com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    int a = 2;
    int h = 4;


    public Triangle() {
        super();
    }

    @Override
    public int getPerimeter() {
        return a * 3;
    }

    @Override
    public int getArea() {
        return (a * h) / 2;
    }
}
