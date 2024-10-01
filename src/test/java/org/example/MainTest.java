package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testInitialClickCount() {
        Button button = new Button();
        assertEquals(0, button.getNumberClick(), "Initial click count should be 0");
    }

    @Test
    public void testResetClickCount() {
        Button button = new Button();
        button.click();
        button.reset();
        button.click();
        button.click();
        assertEquals(2, button.getNumberClick(), "Click count should be 2 after reset");
    }
}