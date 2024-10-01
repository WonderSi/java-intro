package org.example;
import java.util.List;
import java.util.ArrayList;

public class OddEvenSeparator {
    List<Integer> evenNumbers = new ArrayList<>();
    List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println(evenNumbers);
    }

    public void odd() {
        System.out.println(oddNumbers);
    }

    public List<Integer> getEven() {
        return new ArrayList<>(evenNumbers); // Return a copy of the even list ******* FOR TEST
    }

    public List<Integer> getOdd() {
        return new ArrayList<>(oddNumbers); // Return a copy of the odd list ******* FOR TEST
    }
}