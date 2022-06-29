package com.company.generic;

public class Card<T extends Number> {
    private T id;
    private double balance;

    Card(T id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public T getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
