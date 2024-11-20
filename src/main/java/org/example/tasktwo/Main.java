package org.example.tasktwo;

public class Main {
    public static void main(String[] args) {
        ShoeWarehouse warehouse = new ShoeWarehouse();

        int numOrders = 20;

        // Поток производителя
        Producer producer = new Producer(warehouse, numOrders);
        producer.start();

        // Поток потребителя
        int numConsumers = numOrders / 5;
        for (int i = 0; i < numConsumers; i++) {
            Consumer consumer = new Consumer(warehouse, 5);
            consumer.start();
        }
    }
}
