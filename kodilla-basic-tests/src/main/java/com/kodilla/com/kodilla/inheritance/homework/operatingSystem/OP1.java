package com.kodilla.com.kodilla.inheritance.homework.operatingSystem;

public class OP1 extends OperatingSystem {

    public OP1(int year) {
        super(year);
        System.out.println("Operating system no 2");
    }

    @Override
    public void turnOn() {
        System.out.println("Operating system is not waiting to be turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Operating system is not turn off");
    }
}

