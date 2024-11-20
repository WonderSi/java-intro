package org.example.tasktwo;

public class Consumer extends Thread {
    private final ShoeWarehouse warehouse;
    private final int ordersToProcess;

    public Consumer(ShoeWarehouse warehouse, int ordersToProcess) {
        this.warehouse = warehouse;
        this.ordersToProcess = ordersToProcess;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < ordersToProcess; i++) {
                Order order = warehouse.fulfillOrder();  // Получаем заказ для обработки. Это если его нужно куда-то дальше использовать
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
