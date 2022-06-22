package com.company.task11multithreading.les1;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().isInterrupted();
    }
}
