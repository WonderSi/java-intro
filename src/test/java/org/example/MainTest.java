package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testOne() {
        assertEquals("1", Main.one(1));
        assertEquals("fizz", Main.one(5));
        assertEquals("buzz", Main.one(7));
        assertEquals("fizzbuzz", Main.one(490));
    }

    @Test
    void testTwo() {
        assertEquals("llatsni ekam", Main.two("make install"));
    }

    @Test
    void testThree() {
        assertEquals("Корни уравнения: 1.7071067811865475 и 0.2928932188134524", Main.three(2, -4, 1));
        assertEquals("Уравнение не имеет вещественных корней.", Main.three(1, -4, 4));
    }

    @Test
    void testFour() {
        assertEquals(0.6101111104444433, Main.four(2, 1e-6));
    }

    @Test
    void testFive() {
        assertEquals(true, Main.five("a roza ypala na lapy azora"));
    }

}