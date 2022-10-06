package com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{

    int speed;
    double acceleration;

    public Skoda(int speed, double acceleration ){
        this.speed = speed;
        this.acceleration = acceleration;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
         speed += acceleration;
    }


    @Override
    public void decreaseSpeed() {
        speed -= acceleration;
    }
}
