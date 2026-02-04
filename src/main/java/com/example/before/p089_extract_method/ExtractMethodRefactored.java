package com.example.before.p089_extract_method;

public class ExtractMethodRefactored {
    void printOwning(String name, double amount) {
        printBanner();
        printDetails(name, amount);
    }

    private static void printDetails(String name, double amount) {
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println("--- Banner ---");
    }

}
