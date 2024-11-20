package org.example.taskone;

public class MultithreadingExample {
    public static void main(String[] args) {
        Thread evenThread = new ThreadEven();

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}


class ThreadEven extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
class RunnableOdd implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
*/
