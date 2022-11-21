package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {

    private double orderValue;
    private Date date;
    private String login;

    public Order(double orderValue, Date date, String login) {
        this.orderValue = orderValue;
        this.date = date;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public Date getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
//która będzie przechowywać dane zamówienia: wartość zamówienia, datę oraz login osoby dokonującej zamówienia.