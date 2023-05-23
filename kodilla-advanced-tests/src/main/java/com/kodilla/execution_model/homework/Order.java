package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {

    private double orderTotal;
    private Date date;
    private String login;

    public Order(double orderValue, Date date, String login) {
        this.orderTotal = orderValue;
        this.date = date;
        this.login = login;
    }

    public double getOrderTotal() {
        return orderTotal;
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
                "orderValue=" + orderTotal +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
