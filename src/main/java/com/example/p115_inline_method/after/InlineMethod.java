package com.example.p115_inline_method.after;

public class InlineMethod {
    private int numberOfLateDeliveries;

    public static void main(String[] args) {
        InlineMethod inlineMethod1 = new InlineMethod(4);
        System.out.println("-- With 4 late deliveries --");
        System.out.println((inlineMethod1.numberOfLateDeliveries > 5) ? 2 : 1);

        InlineMethod inlineMethod2 = new InlineMethod(6);
        System.out.println("-- With 6 late deliveries --");
        System.out.println((inlineMethod2.numberOfLateDeliveries > 5) ? 2 : 1);
    }

    public InlineMethod(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }
}
