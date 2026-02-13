package com.example.p106_extract_method.after;

public class ExtractMethod {
    void printOwning(String name, double amount) {
        printBanner();
        printDetails(name, amount);
    }

    private void printDetails(String name, double amount) {
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println("--- Banner ---");
    }
}
