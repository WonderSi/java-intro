package org.example;

import java.util.Scanner;

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

    public static void three() {
        Scanner scanner = new Scanner(System.in);

        // Получаем коэффициенты от пользователя
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();

        // Вычисляем дискриминант
        double d = b * b - 4 * a * c;

        // Проверяем наличие вещественных корней
        if (d >= 0) {
            // Вычисляем корни
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            if (Math.abs(root1 % 1) > 0.00001 || Math.abs(root2 % 1) > 0.00001) {
                System.out.printf("Корни уравнения: %.2f и %.2f%n", root1, root2);
            }
        } else {
            System.out.println("Уравнение не имеет вещественных корней.");
        }

        scanner.close();
    }

    public static void four() {
        double sum = 0;
        int n = 2;

        while (true) {
            double term = 1 / (Math.pow(n, 2)+n-2);

            if (Math.abs(term) < 1e-6) {
                break;
            }

            sum += term;
            n++;
        }

        System.out.println("Сумма ряда: " + sum);
    }


    public static void main(String[] args) {
        four();
    }
}