package org.example;

public class Main {

    public static void one() {
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0 ) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            }

            System.out.println(i);
        }
    }

    public static void two() {
        String first_word = "make install";

        char[] arr = first_word.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        two();
    }
}