package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed;
    double acceleration;

    public Opel(){
        this.speed = 0;
        this.acceleration = 40;
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
