package org.example;

import java.util.HashMap;
import java.util.Map;

public class FifthTask {
    // Метод для инверсии map
    public static <K, V> Map<V, K> invertMap(Map<K, V> originalMap) {
        // Создаем новsq map для хранения инвертированных пар
        Map<V, K> invertedMap = new HashMap<>();

        // Итерация по всем записям оригинального map
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            // Получаем значение и ключ из текущей записи
            V value = entry.getValue();
            K key = entry.getKey();

            // Добавляем инвертированную пару в новый map
            invertedMap.put(value, key);
        }

        // Возвращаем инвертированный map
        return invertedMap;
    }
}
