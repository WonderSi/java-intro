package org.example.taskthree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int numOrders = 20;
        int numConsumers = 4;  // Например, 4 потребителя

        // Создаем склад с пулом потоков для потребителей
        ShoeWarehouse warehouse = new ShoeWarehouse(numConsumers);

        // Создаем и запускаем поток производителя
        ExecutorService producerService = Executors.newSingleThreadExecutor(); // Пул с единственным потоком
        Producer producer = new Producer(warehouse, numOrders);
        producerService.submit(producer);

        // Запускаем потребителей
        warehouse.startConsumers(numConsumers, numOrders / numConsumers);

        // Ждем завершения всех задач
        producerService.shutdown();
        warehouse.shutdown();
    }
}
