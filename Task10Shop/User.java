package com.company.Task10Shop;

public class User {
    private String name;
    private String surname;
    private int telephoneNumber;
    private double moneyNumber;

    User(String name, String surname, int telephoneNumber, double moneyNumber) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.moneyNumber = moneyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public double getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(double moneyNumber) {
        this.moneyNumber = moneyNumber;
    }
}
