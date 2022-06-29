package com.company.creditCard;

public class CreditCard {
    private double balance;
    private int numberCard;

    CreditCard (int numberCard) {
        this.numberCard = numberCard;
    }

    double getBalance(){
        return balance;
    }

    int getNumberCard(){
        return numberCard;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void setNumberCard(int numberCard){
        this.numberCard = numberCard;
    }
}
