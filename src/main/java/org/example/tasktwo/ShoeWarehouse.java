package org.example.tasktwo;

import java.util.LinkedList;
import java.util.Queue;

public class ShoeWarehouse {
    // Статический список для всех заказов (FIFO)
    public static final Queue<Order> orders = new LinkedList<>();

    // Максимальный размер склада (например, 10 заказов)
    private static final int MAX_ORDERS = 10;

    // Метод для получения нового заказа (производителем) Producer
    public synchronized void receiveOrder(Order order) throws InterruptedException {
        while (orders.size() >= MAX_ORDERS) {
            System.out.println("Склад переполнен. Ожидание свободного места...");
            wait();  // Ожидаем, пока не освободится место
        }
        orders.add(order);
        System.out.println("Получен заказ: " + order);
        notifyAll();  // Оповещаем всех потребителей, что есть новый заказ
    }

    // Метод для выполнения заказа (потребителем) Consumer
    public synchronized Order fulfillOrder() throws InterruptedException {
        while (orders.isEmpty()) {
            System.out.println("Нет заказов. Ожидание новых...");
            wait();  // Ожидаем, пока не появится заказ
        }
        Order order = orders.poll();  // Извлекаем и выполняем первый заказ
        System.out.println("Выполняется заказ: " + order);
        notifyAll();  // Оповещаем всех производителей, что можно добавлять новые заказы
        return order;
    }
}
