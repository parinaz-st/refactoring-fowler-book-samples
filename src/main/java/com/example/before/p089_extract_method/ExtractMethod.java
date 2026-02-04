package com.example.before.p089_extract_method;

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
