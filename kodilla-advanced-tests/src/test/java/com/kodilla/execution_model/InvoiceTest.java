package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTest {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoice() {
        int numberOfItems = invoice.getSize();
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        Item result = invoice.getItem(2);
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        Item result = invoice.getItem(-3);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        Item result = invoice.getItem(7);
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}