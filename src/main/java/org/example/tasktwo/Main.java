// Main.java
package org.example.tasktwo;

public class Main {
    public static void main(String[] args) {
        // Создаем склад
        ShoeWarehouse warehouse = new ShoeWarehouse();

        // Количество заказов, которые должен создать производитель
        int numOrders = 20;

        // Создаем и запускаем поток производителя
        Producer producer = new Producer(warehouse, numOrders);
        producer.start();

        // Создаем и запускаем потоки потребителей (по 5 заказов на каждый поток)
        int numConsumers = numOrders / 5;
        for (int i = 0; i < numConsumers; i++) {
            Consumer consumer = new Consumer(warehouse, 5);
            consumer.start();
        }
    }
}
