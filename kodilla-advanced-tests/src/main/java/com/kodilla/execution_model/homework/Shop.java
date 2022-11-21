package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> items = new ArrayList<>();


    //dodanie nowego zamówienia,

    public void addItem(Order item) {
        this.items.add(item);
    }


    //zwrócenie listy zamówień z zakresu dwóch dat ..............

    public List<Order> filteredOrders() {
        List<Order> filteredOrders = items
                .stream()
                .filter(i -> i.getDate())
                .collect(Collectors.toList());
        return filteredOrders;
    }


    //pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),

    public void getMinimalOrder() {
        Collections.max(List <Order> items);
    }


    //zwrócenie liczby zamówień,
    public int getSize() {
        return this.items.size();
    }


    //zsumowanie wartości wszystkich zamówień.

    public double sumOrderTotal() {
        double sum = items
                .stream()
                .filter(o -> o.getOrderTotal() > 0)
                .mapToDouble(Order::getOrderTotal)
                .sum();
        return sum;
    }
}

