package com.company.creditCard;

public class Bank {
    protected CreditCard creditCard;
    protected CreditCard creditCard1;


    Bank(CreditCard creditCard, CreditCard creditCard1) {
        this.creditCard = creditCard;
        this.creditCard1 = creditCard1;
    }

    private CreditCard searchFrom(int numberOfCard) {
        if (numberOfCard == creditCard.getNumberCard()) {
            return creditCard;
        } else {
            return creditCard1;
        }
    }

    private CreditCard searchTo(int numberOfCard) {
        if (numberOfCard != creditCard.getNumberCard()) {
            return creditCard;
        } else {
            return creditCard1;
        }
    }

    boolean broadcast(int numberFrom, double amount) {
        CreditCard cardFrom = searchFrom(numberFrom);
        CreditCard cardTo = searchTo(numberFrom);

        if (cardFrom.getBalance() == 0) return false;
        double card1 = cardFrom.getBalance() - amount;
        double card2 = cardTo.getBalance() + amount;

        cardFrom.setBalance(card1);
        cardTo.setBalance(card2);
        return true;
    }

    boolean broadcast(int numberFrom, double amount, boolean dept) {

        return broadcast(numberFrom, amount) && dept;
    }

    boolean broadcast(int numberFrom, int amount) {
        CreditCard cardFrom = searchFrom(numberFrom);
        CreditCard cardTo = searchTo(numberFrom);

//        if (cardFrom.balance == 0) return false;
//        cardFrom.balance -= amount;
//        cardTo.balance += amount;

        return true;
    }
}
