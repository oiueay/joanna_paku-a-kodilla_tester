package com.kodilla.stream.exception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void mmm_withException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("1111"));
    }
}


