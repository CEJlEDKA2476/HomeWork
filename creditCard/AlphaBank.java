package com.company.creditCard;

import java.util.Objects;

public class AlphaBank extends Bank {
    private int amount;

    AlphaBank(CreditCard creditCard, CreditCard creditCard1, int amount) {
        super(creditCard, creditCard1);
        this.amount = amount;
    }

    @Override
    boolean broadcast(int numberFrom, double amount) {
        return true;
    }

    boolean what(int amount) {
         return amount > 1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this);
    }
}
