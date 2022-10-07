package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;
import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15 + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(15 + 1);
        if (drawnCarKind == 1)
            return new Skoda();
        else if (drawnCarKind == 2)
            return new Opel();
        else {
            return new Ford();
        }
    }
}
