package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{

    int speed;
    double acceleration;

    public Skoda(){
        this.speed = 0;
        this.acceleration = 20;
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
