package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> items = new ArrayList<>();


    //dodanie nowego zamówienia

    public void addItem(Order item) {
        this.items.add(item);
    }


    //zwrócenie listy zamówień z zakresu dwóch dat

    public List<Order> filteredOrders(Date from, Date to) {
        return items.stream()
                .filter(i -> i.getDate().after(from))
                .filter(i -> i.getDate().before(to))
                .collect(Collectors.toList());
    }


    //pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)

    public List<Order> getMinimalOrder(double min, double max) {
        return items.stream()
                .filter(i -> i.getOrderTotal() > min)
                .filter(i -> i.getOrderTotal() < max)
                .collect(Collectors.toList());
    }


    //zwrócenie liczby zamówień
    public int
    getSize() {
        return this.items.size();
    }


    //zsumowanie wartości wszystkich zamówień

    public double sumOrderTotal() {
        return items.stream()
                .mapToDouble(Order::getOrderTotal)
                .sum();
    }
}

