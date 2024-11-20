package org.example.taskthree;

public class Consumer implements Runnable {
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
                Order order = warehouse.fulfillOrder();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
