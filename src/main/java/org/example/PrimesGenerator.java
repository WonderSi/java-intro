package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator implements Iterator<Integer> {

    private List<Integer> primes;

    public PrimesGenerator(int N) {
        primes = new ArrayList<>();
        generatePrimes(N);
    }

    private void generatePrimes(int N) {
        int count = 0;
        int number = 2; // Первое простое число

        while (count < N) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public Iterator<Integer> currentIterator() {
        return new Iterator<Integer>() {
            private int currentIndex = 0;
            private int currentSize = primes.size() - 1;

            @Override
            public boolean hasNext() {
                return currentIndex <= currentSize;
            }

            @Override
            public Integer next() {
                return primes.get(currentIndex++);
            }
        };
    }

    public Iterator<Integer> reverseIterator() {
        return new Iterator<Integer>() {
            private int currentIndex = primes.size() - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Integer next() {
                return primes.get(currentIndex--);
            }
        };
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return 0;
    }
}
