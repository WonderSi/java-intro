package org.example;

import java.util.HashMap;
import java.util.Map;

public class FourthTask {
    public static void result() {
        String text = "This is an example. This example is simple.";

        // Преобразуем текст в нижний регистр и разбиваем на слова
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // Подсчет частоты слов
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Частота слов: " + wordCountMap);
    }
}
