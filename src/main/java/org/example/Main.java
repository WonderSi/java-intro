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
        PrimesGeneratorTest.result(10);

    }
}