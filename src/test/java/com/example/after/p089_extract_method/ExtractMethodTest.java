package com.example.after.p089_extract_method;

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
