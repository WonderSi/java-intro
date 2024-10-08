package org.example;

public class SecondTask {
    public static void result() {
        PrimesGenerator primes = new PrimesGenerator(10);
        new PrimesGeneratorTest(primes);
    }
}
