package com.kodilla.com.kodilla.inheritance.homework.operatingSystem;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
        System.out.println("Operating system no 1");
    }

    public void turnOn() {
        System.out.println("Operating system is turn on");
    }

    public void turnOff() {
        System.out.println("Operating system is not waiting to be turned off");
    }

    public int getYear() {
        return year;
    }
}
