package com.example.p119_extract_variable.after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void extractVariableTest(){
        Order order = new Order();
        order.setItemPrice(1000);
        order.setQuantity(2);
        assertEquals(order.calculatePrice(order), 2100.0);
    }
}
