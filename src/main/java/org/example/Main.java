package org.example;


public class Main {
    public static String fizzBuzz(int n) {

            if (n % 5 == 0 && n % 7 == 0 ) {
                return "fizzbuzz";
            } else if (n % 5 == 0) {
                return "fizz";
            } else if (n % 7 == 0) {
                return "buzz";
            } else {
                return Integer.toString(n);
        }
    }

    public static String reverseString(String str) {

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(arr);
    }

    public static String quadraticEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        double root1 = 0;
        double root2 = 0;

        if (d >= 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
        }

        if (Math.abs(root1 % 1) > 0.00001 || Math.abs(root2 % 1) > 0.00001) {
            return root1 + ";" + root2;
        } else {
            return null;
        }

    }

    public static double sumRows(double n, double m) {
        double sum = 0;

        double term;
        while (true) {

            term = 1 / (Math.pow(n, 2)+n-2);

            if (Math.abs(term) < m) {
                break;
            }

            sum += term;
            n++;
        }

        return sum;
    }

    public static boolean wordPalindrome(String n) {

        String cleanedText = n.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(cleanedText);
        String reversedText = sb.reverse().toString();

        return cleanedText.equalsIgnoreCase(reversedText);
    }

    public static void main(String[] args) {

        // (1)
        int n1 = 500;
        for (int i = 0; i <= n1; i++) {
            System.out.println(fizzBuzz(i));
        }
        // (2)
        String n2 = "Вера, котяра, – харя Токарева";
        String result2 = reverseString(n2);
        System.out.println(result2);
        // (3)
        double a2 = 2;
        double b2 = -4;
        double c2 = 1;

        System.out.println(quadraticEquation(a2, b2, c2));
        // (4)
        double n4 = 2;
        double m4 = 1e-6;
        double result4 = sumRows(n4, m4);
        System.out.println(result4);
        // (5)
        String n5 = "Аня как Яна";
        boolean result5 = wordPalindrome(n5);
        System.out.println(result5);
    }
}