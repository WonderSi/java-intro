package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //1
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

    //2
    @Test
    public void testInitialBalance() {
        Balance balance = new Balance();
        assertEquals("=", balance.result(), "Weights should be equal");
    }
    @Test
    public void testRightBalance() {
        Balance balance = new Balance();
        balance.addRight(56);
        balance.addLeft(5);
        assertEquals("R", balance.result(), "Right should be heavier");
    }
    @Test
    public void testLeftBalance() {
        Balance balance = new Balance();
        balance.addRight(15);
        balance.addLeft(94);
        assertEquals("L", balance.result(), "Left should be heavier");
    }

}