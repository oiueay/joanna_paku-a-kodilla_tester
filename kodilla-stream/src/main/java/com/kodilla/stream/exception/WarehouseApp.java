package com.kodilla.stream.exception;

public class WarehouseApp {

    public static void main(String[] args) {
         Warehouse warehouse = new Warehouse();
         warehouse.addOrder(new MyOrder("1234"));
         warehouse.addOrder(new MyOrder("5678"));

        try {
            warehouse.getOrder("9999");
        } catch (OrderDoesntExistException e) {
            System.out.println("Brak zamówienia o podanym numerze");
        }
    }
}
