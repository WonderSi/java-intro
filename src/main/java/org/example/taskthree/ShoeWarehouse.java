package org.example.taskthree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShoeWarehouse {
    public static final Queue<Order> orders = new LinkedList<>();
    private static final int MAX_ORDERS = 10;
    private final ExecutorService executorService;

    public ShoeWarehouse(int numConsumers) {
        // Используем FixedThreadPool для потребителей
        executorService = Executors.newFixedThreadPool(numConsumers);
    }

    // Метод для получения нового заказа (производителем)
    public synchronized void receiveOrder(Order order) throws InterruptedException {
        while (orders.size() >= MAX_ORDERS) {
            System.out.println("Склад переполнен. Ожидание свободного места...");
            wait();
        }
        orders.add(order);
        System.out.println("Получен заказ: " + order);
        notifyAll();
    }

    // Метод для выполнения заказа (потребителем)
    public synchronized Order fulfillOrder() throws InterruptedException {
        while (orders.isEmpty()) {
            System.out.println("Нет заказов. Ожидание новых...");
            wait();
        }
        Order order = orders.poll();
        System.out.println("Выполняется заказ: " + order);
        notifyAll();
        return order;
    }

    // Запускаем потребителей в пуле
    public void startConsumers(int numConsumers, int ordersPerConsumer) {
        for (int i = 0; i < numConsumers; i++) {
            executorService.submit(new Consumer(this, ordersPerConsumer));
        }
    }

    // Останавливаем пул потоков
    public void shutdown() {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
