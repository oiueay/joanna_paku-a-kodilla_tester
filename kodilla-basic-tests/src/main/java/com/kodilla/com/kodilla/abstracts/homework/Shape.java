package com.kodilla.com.kodilla.abstracts.homework;

public abstract class Shape {

    private int a;
    private int b;
    private int h;

    public Shape(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public abstract int getPerimeter();

    public abstract int getArea();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }
}


