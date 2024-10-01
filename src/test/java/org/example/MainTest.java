package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //1
    @Test
    public void testInitialClickCount() {
        Button button = new Button();
        assertEquals(1, button.click(), "Click count should be 1");
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

    //3

    //4
    @Test
    public void testAddEvenNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(4);
        separator.addNumber(6);

        assertEquals(Arrays.asList(4, 6), separator.getEven(), "The even list should contain 4 and 6");
    }
    @Test
    public void testAddOddNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(3);
        separator.addNumber(5);

        assertEquals(Arrays.asList(3, 5), separator.getOdd(), "The odd list should contain 3 and 5");
    }
    @Test
    public void testAddMixedNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(1);
        separator.addNumber(4);
        separator.addNumber(3);

        assertEquals(Arrays.asList(2, 4), separator.getEven(), "The even list should contain 2 and 4");
        assertEquals(Arrays.asList(1, 3), separator.getOdd(), "The odd list should contain 1 and 3");
    }



}