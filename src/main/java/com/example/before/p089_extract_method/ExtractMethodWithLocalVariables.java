package com.example.before.p089_extract_method;

import com.example.after.p089_extract_method.Order;

import java.util.ArrayList;

public class ExtractMethodWithLocalVariables {
    private ArrayList<com.example.after.p089_extract_method.Order> orders = new ArrayList<com.example.after.p089_extract_method.Order>();

    public static void main( String[] args )
    {
        new ExtractMethodWithLocalVariables().printOwning("Seedtech", 250);
    }

    public ExtractMethodWithLocalVariables() {
        com.example.after.p089_extract_method.Order order1 = new com.example.after.p089_extract_method.Order(10);
        com.example.after.p089_extract_method.Order order2 = new com.example.after.p089_extract_method.Order(100);
        orders.add(order1);
        orders.add(order2);
    }

    void printOwning(String name, double previousAmount) {
        double outstanding = previousAmount * 1.2;

        printBanner();
        // calculate outstanding
        for (Order order: orders) {
            outstanding += order.getAmount();
        }

        //print details
        System.out.println ("name:" + name);
        System.out.println ("amount:" + outstanding);
     }

    private void printBanner() {
        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
    }
}
