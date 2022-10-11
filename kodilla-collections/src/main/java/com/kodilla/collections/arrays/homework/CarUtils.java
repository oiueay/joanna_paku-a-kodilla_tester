package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {

        Random random = new Random();
        int howMany = random.nextInt(5) + 1;
        for (int n = 0; n <= howMany; n++) {
            car.increaseSpeed();
        }
        System.out.println("Car kind: " + getCarName(car) + car.getSpeed());
    }


    private static String getCarName(Car car) {
        if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }
}



