package org.example;

import java.util.*;

import static org.example.FifthTask.invertMap;

public class Main {
    public static void main(String[] args) {
        //1
        FirstTask.result();
        //2
        SecondTask.result();
        //3
        ThirdTask.result();
        //4
        FourthTask.result();
        //5
        Map<Integer, String> original = new HashMap<>();
        original.put(1, "one");
        original.put(2, "two");
        original.put(3, "three");

        Map<String, Integer> inverted = invertMap(original);
        System.out.println(inverted); // {one=1, two=2, three=3}

    }
}