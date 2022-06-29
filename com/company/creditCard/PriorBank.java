package com.company.creditCard;

public class PriorBank extends Bank{

    PriorBank(CreditCard creditCard, CreditCard creditCard1){
        super(creditCard, creditCard1);
    }

    boolean broadcast(int numberFrom, double amount) {
        return false;
    }

}
