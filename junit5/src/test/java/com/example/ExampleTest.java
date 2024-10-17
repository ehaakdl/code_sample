package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {

    @Test
    @DisplayName("Test1")
    void testAddition() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void testTrueCondition() {
        
        assertTrue(3 > 2, "3 is greater than 2");
    }

    @Test
    void testFailure() {
        assertEquals(1, 2, "This test is designed to fail");
    }
}