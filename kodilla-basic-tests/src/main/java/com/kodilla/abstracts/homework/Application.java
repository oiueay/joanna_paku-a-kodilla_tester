package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square(2);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(4, 4, 6);


        System.out.println("square perimeter:" + square.getPerimeter());
        System.out.println("square area:" + square.getArea());

        System.out.println("rectangle perimeter:" + rectangle.getPerimeter());
        System.out.println("rectangle area:" + rectangle.getArea());

        System.out.println("triangle perimeter:" + triangle.getPerimeter());
        System.out.println("triangle area:" + triangle.getArea());
    }
}
