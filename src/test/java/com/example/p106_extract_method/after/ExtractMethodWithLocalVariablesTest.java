package com.example.p106_extract_method.after;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExtractMethodWithLocalVariablesTest {
    @Test
    public void ExtractMethodWithLocalVariablesTest() {
        ExtractMethodWithLocalVariables testMethod = new ExtractMethodWithLocalVariables();

        Invoice invoice = new Invoice();
        Customer customer = new Customer("parinaz");
        invoice.setOrders(populateOrderList());
        invoice.setCustomer(customer);
        testMethod.printOwning(invoice);
    }
    private List<Order> populateOrderList() {
        List<Order> orderList = new ArrayList<>();
        Order order1 = new Order(1000);
        Order order2 = new Order(2000);
        orderList.add(order1);
        orderList.add(order2);
        return orderList;
   }
}
