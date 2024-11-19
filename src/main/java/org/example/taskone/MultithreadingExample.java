package org.example.taskone;

public class MultithreadingExample {
    public static void main(String[] args) {
        // Первый поток, наследующий Thread
        Thread evenThread = new ThreadEven();

        // Второй поток, реализующий Runnable
        Thread oddThread = new Thread(new RunnableOdd());

        // Запуск потоков
        evenThread.start();
        oddThread.start();
    }
}


// Класс для четных чисел (наследует Thread)
class ThreadEven extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000); // Пауза для демонстрации асинхронности
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Класс для нечетных чисел (реализует Runnable)
class RunnableOdd implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000); // Пауза для демонстрации асинхронности
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
