package org.example;

import java.util.*;

public class FirstTask {
    public static void result() {
        // a) Создайте массив из N случайных чисел от 0 до 100.
        int N = 10;
        Integer[] array = new Integer[N];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(101);
        }
        System.out.println("a) Массив: " + Arrays.toString(array));

        // b) На основе массива создайте список List.
        List<Integer> list = Arrays.asList(array);
        System.out.println("b) Список: " + list);

        // c) Отсортируйте список по возрастанию.
        Collections.sort(list);
        System.out.println("c) Отсортированный список по возрастанию: " + list);

        // d) Отсортируйте список в обратном порядке.
        list.sort(Collections.reverseOrder());
        System.out.println("d) Отсортированный список в обратном порядке: " + list);

        // e) Перемешайте список.
        Collections.shuffle(list);
        System.out.println("e) Перемешанный список: " + list);

        // f) Выполните циклический сдвиг на 1 элемент.
        System.out.println("f) До циклического сдвига на 1 элемент: " + list);
        Collections.rotate(list, 1);
        System.out.println("   Циклический сдвиг на 1 элемент: " + list);

        // g) Оставьте в списке только уникальные элементы.
        Set<Integer> uniqueSet = new HashSet<>(list);
        list = new ArrayList<>(uniqueSet);
        System.out.println("g) Уникальные элементы: " + list);

        // h) Оставьте в списке только дублирующиеся элементы.
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        System.out.println("h) Дублирующиеся элементы: " + duplicates);

        // i) Из списка получите массив.
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("i) Новый массив: " + Arrays.toString(newArray));

        // j) Посчитайте количество вхождений каждого числа в массив и выведите на экран.
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("j) Число: " + entry.getKey() + ", Вхождения: " + entry.getValue());
        }
    }
}
