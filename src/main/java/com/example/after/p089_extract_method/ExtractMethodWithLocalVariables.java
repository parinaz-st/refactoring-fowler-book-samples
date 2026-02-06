package com.example.after.p089_extract_method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtractMethodWithLocalVariables {
    void printOwning(Invoice invoice) {
        printBanner();
        Integer outstanding = calculateOutstandoing(invoice.getOrders());
        recordDueDate(invoice);
        printInvoiceDetails(invoice, outstanding);
    }
    private void printBanner(){
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
    }
    private void printInvoiceDetails(Invoice invoice, Integer outstanding){
        System.out.println ("name:" + invoice.getCustomer().getName());
        System.out.println ("amount: " + outstanding);
    }
    private Integer calculateOutstandoing(List<Order> lstOrder){
        Integer result = 0;
        for (Order order: lstOrder) {
            result += order.getAmount();
        }
        return result;
    }
    private void recordDueDate(Invoice invoice){
        Date today = new Date();
        invoice.setDueDate( new Date(today.getYear(), today.getMonth(), today.getDay() + 30));
    }
}
