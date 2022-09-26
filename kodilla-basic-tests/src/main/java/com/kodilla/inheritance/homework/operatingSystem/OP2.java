package com.kodilla.inheritance.homework.operatingSystem;

public class OP2 extends OP1 {

    public OP2(int year) {
        super(year);
        System.out.println("Operating system no 3");
    }

    @Override
    public void turnOn() {
        System.out.println("Operating system is waiting to be turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Operating system is turn off");
    }
}
