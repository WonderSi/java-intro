package org.example;

import java.util.*;

public class Main {
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        //1
        FirstTask.result();
        //2
        int N = 10; // Задайте количество простых чисел для генерации
        PrimesGenerator generator = new PrimesGenerator(N);

        System.out.println("Простые числа в прямом порядке:");
        Iterator<Integer> currentIterator = generator.currentIterator();
        while (currentIterator.hasNext()) {
            System.out.print(currentIterator.next() + " ");
        }

        System.out.println("\nПростые числа в обратном порядке:");
        Iterator<Integer> reverseIterator = generator.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }

    }
}