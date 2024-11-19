package org.example.tasktwo;

public class Producer extends Thread {
    private final ShoeWarehouse warehouse; // Используемый склад
    private final int numOrders;  // Количество заказов для создания

    public Producer(ShoeWarehouse warehouse, int numOrders) {
        this.warehouse = warehouse;
        this.numOrders = numOrders;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numOrders; i++) {
                // Создание случайного заказа
                String shoeType = "Обувь" + (i % 3 + 1);  // Пример с тремя типами обуви
                int quantity = (int) (Math.random() * 10) + 1;  // Случайное количество от 1 до 10
                Order order = new Order(i, shoeType, quantity); // Создание заказа

                warehouse.receiveOrder(order);
                Thread.sleep(500);  // Задержка для имитации времени создания заказа
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
