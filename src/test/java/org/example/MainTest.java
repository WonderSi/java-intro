package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testFizzBuzz() {
        assertEquals("1", Main.fizzBuzz(1));
        assertEquals("fizz", Main.fizzBuzz(5));
        assertEquals("buzz", Main.fizzBuzz(7));
        assertEquals("fizzbuzz", Main.fizzBuzz(490));
    }

    @Test
    void testReverseString() {
        assertEquals("llatsni ekam", Main.reverseString("make install"));
    }

    @Test
    void testQuadraticEquation() {
        assertEquals("1.7071067811865475;0.2928932188134524", Main.quadraticEquation(2, -4, 1));
        assertNull(Main.quadraticEquation(1, -4, 4));
    }

    @Test
    void testSumRows() {
        assertEquals(0.6101111104444433, Main.sumRows(2, 1e-6));
    }

    @Test
    void testWordPalindrome() {
        assertTrue(Main.wordPalindrome("a roza ypala na lapy azora"));
    }

}