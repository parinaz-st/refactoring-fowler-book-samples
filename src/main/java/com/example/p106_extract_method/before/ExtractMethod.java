package com.example.p106_extract_method.before;

public class ExtractMethod {
    void printOwning(String name, double amount) {
        printBanner();

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println("--- Banner ---");
    }
}
