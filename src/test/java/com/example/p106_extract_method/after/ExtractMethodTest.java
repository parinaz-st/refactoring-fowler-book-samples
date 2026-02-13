package com.example.p106_extract_method.after;

import org.junit.jupiter.api.Test;

public class ExtractMethodTest {
    @Test
    void printOwning() {
        ExtractMethod extractMethod = new ExtractMethod();
        String name = "Parinaz";
        double amount = 1000;
        extractMethod.printOwning(name,amount);
    }

}
