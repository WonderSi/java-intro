package org.example.tasktwo;

import java.util.LinkedList;
import java.util.Queue;

public class ShoeWarehouse {
    public static final Queue<Order> orders = new LinkedList<>();

    private static final int MAX_ORDERS = 10;

    // Получения нового заказа Producer
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
        notifyAll();  // Оповещаем всех потребителей, что есть новый заказ
    }

    // Выполнение заказа Consumer
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
        notifyAll();  // Оповещаем всех производителей, что можно добавлять новые заказы
        return order;
    }
}
