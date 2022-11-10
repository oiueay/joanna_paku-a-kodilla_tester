
package com.kodilla.stream.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {

    private List<MyOrder> orders = new ArrayList<>();

    public void addOrder(MyOrder order){
        orders.add(order);
    }

    public MyOrder getOrder(String number) throws OrderDoesntExistException {
        Optional<MyOrder> result = orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst();
        if (result.isEmpty()) {
            throw new OrderDoesntExistException();
        }
        return result.get();
    }
}


