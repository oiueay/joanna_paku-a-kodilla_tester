package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    int speed;
    double acceleration;

    public Ford(){
        this.speed = 0;
        this.acceleration = 30;
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
