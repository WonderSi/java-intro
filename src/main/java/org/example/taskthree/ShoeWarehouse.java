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
        executorService = Executors.newFixedThreadPool(numConsumers); // Пул с фиксированным количеством потоков
    }

    // Метод для получения нового заказа (производителем)
    public synchronized void receiveOrder(Order order) throws InterruptedException {
        while (orders.size() >= MAX_ORDERS) {
            try {
                System.out.println("Склад переполнен. Ожидание свободного места...");
                wait();  // Ожидаем, пока не освободится место
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        orders.add(order);
        System.out.println("Получен заказ: " + order);
        notifyAll();
    }

    // Метод для выполнения заказа (потребителем)
    public synchronized Order fulfillOrder() throws InterruptedException {
        while (orders.isEmpty()) {
            try {
                System.out.println("Нет заказов. Ожидание новых...");
                wait();  // Ожидаем, пока не появится заказ
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
    }
}
