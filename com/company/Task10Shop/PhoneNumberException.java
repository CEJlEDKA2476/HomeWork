package com.company.Task10Shop;

public class PhoneNumberException extends Exception{

    public PhoneNumberException(int phoneNumber){
        super("Wrong phone number! " + phoneNumber);
    }
}
