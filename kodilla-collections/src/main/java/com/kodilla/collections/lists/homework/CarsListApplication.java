package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Skoda> cars = new ArrayList<>();
        Skoda Octavia = new Skoda();
        Skoda Superb = new Skoda();
        Skoda Kamiq = new Skoda();
        cars.add(Octavia);
        cars.add(Superb);
        cars.add(Kamiq);

        for (Skoda car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(Kamiq);

        System.out.println(cars.size());


        for (Skoda car : cars) {
            CarUtils.describeCar(car);
        }
    }
}