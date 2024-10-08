package org.example;

import java.util.*;

public class PrimesGeneratorTest {
    PrimesGeneratorTest(PrimesGenerator generator) {

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
