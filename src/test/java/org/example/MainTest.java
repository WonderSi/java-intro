package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testOne() {
        // Захватываем вывод в консоль
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Вызываем метод
        Main.one();

        // Формируем ожидаемый вывод
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                expectedOutput.append("fizzbuzz\r\n");
            } else if (i % 5 == 0) {
                expectedOutput.append("fizz\r\n");
            } else if (i % 7 == 0) {
                expectedOutput.append("buzz\r\n");
            } else {
                expectedOutput.append(i).append("\r\n");
            }
        }

        // Сравниваем захваченный вывод с ожидаемым
        assertEquals(expectedOutput.toString(), outContent.toString());
    }

    @Test
    void testTwo() {
        // Захватываем вывод в консоль
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Вызываем метод
        Main.two();

        // Сравниваем захваченный вывод с ожидаемым
        assertEquals("llatsni ekam", outContent.toString());
    }

    @Test
    void testThree() {
        // Считываем данные c строки: "2 3 -5"
        Scanner scanner = new Scanner("2 3 -5");
        // Перенаправляет стадартный ввод данных (System.in) через массив байтов
        System.setIn(new ByteArrayInputStream(scanner.nextLine().getBytes()));

        // Захватываем вывод в консоль
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Вызываем метод
        Main.three();

        // Сравниваем захваченный вывод с ожидаемым
        assertEquals("Введите значение a: Введите значение b: Введите значение c: Корни уравнения: 1,00 и -2,50\r\n", outContent.toString());
    }

    @Test
    void testFour() {
        // Захватываем вывод в консоль
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Вызываем метод
        Main.four();

        // Сравниваем захваченный вывод с ожидаемым
        assertEquals("Сумма ряда: 0.6101111104444433\r\n", outContent.toString());
    }

    @Test
    void testFive() {
        // Захватываем вывод в консоль
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Вызываем метод
        Main.five();

        // Сравниваем захваченный вывод с ожидаемым
        assertEquals("true\r\n", outContent.toString());
    }
}