package com.company.task11multithreading.les1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();

        Thread thread = new Thread(new MyRunnable());
        thread.interrupt();

    }
}

