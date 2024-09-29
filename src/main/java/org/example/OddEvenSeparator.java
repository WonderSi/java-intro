package org.example;
import java.util.List;
import java.util.ArrayList;

public class OddEvenSeparator {
    List<Integer> listEven = new ArrayList<>();
    List<Integer> listOdd = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            listOdd.add(number);
        } else {
            listEven.add(number);
        }
    }

    public void even() {
        System.out.println(listEven);
    }

    public void odd() {
        System.out.println(listOdd);
    }
}