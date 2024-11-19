// Consumer.java
package org.example.tasktwo;

public class Consumer extends Thread {
    private final ShoeWarehouse warehouse;
    private final int ordersToProcess;  // Количество заказов для обработки

    public Consumer(ShoeWarehouse warehouse, int ordersToProcess) {
        this.warehouse = warehouse;
        this.ordersToProcess = ordersToProcess;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < ordersToProcess; i++) {
                Order order = warehouse.fulfillOrder();  // Получаем заказ для обработки. Это если его нужно куда-то дальше использовать
                Thread.sleep(1000);  // Задержка для имитации времени обработки заказа
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
