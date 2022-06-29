package com.company.task11multithreading.les1;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "index= " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
