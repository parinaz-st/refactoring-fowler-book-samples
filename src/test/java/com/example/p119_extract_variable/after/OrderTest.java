package com.example.p119_extract_variable.after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void extractVariableTest_Order1(){
        Order order = new Order();
        order.setItemPrice(1000);
        order.setQuantity(2);
        assertEquals(2100.0, order.calculatePrice(order));
    }
    @Test
    public void extractVariableTest_Order2(){
        Order2 order = new Order2();
        order.setItemPrice(1000);
        order.setQuantity(2);
        assertEquals(2100.0, order.getPrice());
    }
}
