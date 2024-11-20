package org.example.taskthree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int numOrders = 20;
        int numConsumers = 4;

        ShoeWarehouse warehouse = new ShoeWarehouse(numConsumers);

        // поток производителя
        ExecutorService producerService = Executors.newSingleThreadExecutor(); // пул с единственным потоком
        Producer producer = new Producer(warehouse, numOrders);
        producerService.submit(producer);

        // запускаем потребителей
        warehouse.startConsumers(numConsumers, numOrders / numConsumers);

        producerService.shutdown();
        warehouse.shutdown();
    }
}
