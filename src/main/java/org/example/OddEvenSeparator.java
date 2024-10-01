package org.example;
import java.util.List;
import java.util.ArrayList;

public class OddEvenSeparator {
    List<Integer> listEven = new ArrayList<>();
    List<Integer> listOdd = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            listEven.add(number);
        } else {
            listOdd.add(number);
        }
    }

    public void even() {
        System.out.println(listEven);
    }

    public void odd() {
        System.out.println(listOdd);
    }

    public List<Integer> getEven() {
        return new ArrayList<>(listEven); // Return a copy of the even list ******* FOR TEST
    }

    public List<Integer> getOdd() {
        return new ArrayList<>(listOdd); // Return a copy of the odd list ******* FOR TEST
    }
}