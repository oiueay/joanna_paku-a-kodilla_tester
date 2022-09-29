package com.kodilla.com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();


        System.out.println("square perimeter:" + square.getPerimeter());
        System.out.println("square area:" + square.getArea());

        System.out.println("rectangle perimeter:" + rectangle.getPerimeter());
        System.out.println("rectangle area:" + rectangle.getArea());

        System.out.println("triangle perimeter:" + triangle.getPerimeter());
        System.out.println("triangle area:" + triangle.getArea());
    }
}
