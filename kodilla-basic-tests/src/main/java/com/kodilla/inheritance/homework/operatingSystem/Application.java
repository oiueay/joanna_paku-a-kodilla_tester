package com.kodilla.inheritance.homework.operatingSystem;

import com.kodilla.inheritance.homework.operatingSystem.OP1;
import com.kodilla.inheritance.homework.operatingSystem.OP2;
import com.kodilla.inheritance.homework.operatingSystem.OperatingSystem;

public class Application {
    public static void main(String[] args) {
        OperatingSystem windows1 = new OperatingSystem(1995);
        windows1.turnOn();
        windows1.turnOff();
        System.out.println(windows1.getYear());

        OP1 windows2 = new OP1(1998);
        windows2.turnOn();
        windows2.turnOff();
        System.out.println(windows2.getYear());

        OP2 windows3 = new OP2(2000);
        windows3.turnOn();
        windows3.turnOff();
        System.out.println(windows3.getYear());
    }
}
