package com.example.p106_extract_method.after;

import java.util.Date;

public class ExtractMethodNoLocalVariables {
    void printOwning(Invoice invoice) {
        Integer outstanding = 0;
        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");

        // calculate outstanding
        for (Order order: invoice.getOrders()) {
            outstanding += order.getAmount();
        }
        //record due date
        Date today = new Date();
        invoice.setDueDate(new Date(today.getYear(), today.getMonth(), today.getDay() + 30));

        //print details
        System.out.println ("name:" + invoice.getCustomer().getName());
        System.out.println ("amount" + outstanding);    }
}
