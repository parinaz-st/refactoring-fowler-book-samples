package com.example.after.p089_extract_method;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExtractMethodNoLocalVariablesTest {
    @Test
    public void ExtractMethodNoLocalVariablesTest() {
        ExtractMethodNoLocalVariables testMethod = new ExtractMethodNoLocalVariables();

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
