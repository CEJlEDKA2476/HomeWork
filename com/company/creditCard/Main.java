package com.company.creditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(2617);
        creditCard.setBalance(100d);
        CreditCard creditCard1 = new CreditCard(2618);
        creditCard1.setBalance(50d);

        Bank bank2 = new PriorBank(creditCard, creditCard1);
        bank2.broadcast(2617, 300d);
        System.out.println(bank2.broadcast(2617, 70d));

        Bank bank3 = null;
        if (bank2.broadcast(2617, 30)) {
            bank3 = new AlphaBank(creditCard, creditCard1, 50);
        } else {
            bank3 = new PriorBank(creditCard, creditCard1);
        }
        if (bank3 instanceof AlphaBank) {
            AlphaBank bank4 = (AlphaBank) bank3;
        }
        Bank bank5 = bank3;
        if(bank5 == bank2)

//        AlphaBank bank10 = new AlphaBank(creditCard, creditCard1, 2);
//        alphaBank.broadcast(creditCard.getNumberCard(), 30);
//        Bank bank = new Bank(creditCard, creditCard1);

        System.out.println(creditCard.getBalance());
        System.out.println(creditCard1.getBalance());
//        bank.broadcast(creditCard.getNumberCard(), 20, false);
        System.out.println(creditCard.getBalance());
        System.out.println(creditCard1.getBalance());
    }
}
