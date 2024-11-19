package org.example.taskthree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private final ShoeWarehouse warehouse;
    private final int numOrders;

    public Producer(ShoeWarehouse warehouse, int numOrders) {
        this.warehouse = warehouse;
        this.numOrders = numOrders;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numOrders; i++) {
                String shoeType = "Обувь" + (i % 3 + 1);
                int quantity = (int) (Math.random() * 10) + 1;
                Order order = new Order(i, shoeType, quantity);

                warehouse.receiveOrder(order);
                Thread.sleep(500);  // Имитация времени для создания заказа
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
