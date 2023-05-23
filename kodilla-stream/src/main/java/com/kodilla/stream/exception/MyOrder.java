package com.kodilla.stream.exception;

import java.util.Objects;

public class MyOrder {

    private String number;

    public MyOrder(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOrder myOrder = (MyOrder) o;
        return Objects.equals(number, myOrder.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
