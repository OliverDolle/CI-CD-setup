package com.example.cucumberdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionSteps {
    @Test
    void testAddition() {
        int num1 = 2;
        int num2 = 3;
        int result = Addition.add(num1, num2);
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}
