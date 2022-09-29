package com.kodilla.com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    int a = 2;
    int b = 3;

    public Rectangle() {
        super();
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









//public class Rectangle extends Shape {
//
//    public Rectangle() {
//
//        super(1, 2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return getA();
//    }
//
//    @Override
//    public double getArea() {
//        return getA() * getH();
//    }
//}
