package com.company.Task10Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class UsersFactory {

    UsersFactory() {
    }

    public static ArrayList<User> generateUsers() {
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Ivan", "Kovalenko", 1121, 100));
        userArrayList.add(new User("Alexander", "Ukel", 2312, 180));
        userArrayList.add(new User("Stanislav", "Tsar", 4213, 165));
        userArrayList.add(new User("Alexey", "Olof", 1121, 122));

        return userArrayList;
    }

    public static User generateUser(ArrayList<User> userArrayList) throws PhoneNumberException {
        Scanner in = new Scanner(System.in);
        MenuController.printAddingUsers(AddUsers.NAME);
        String name = in.nextLine();
        MenuController.printAddingUsers(AddUsers.SURNAME);
        String surname = in.nextLine();
        MenuController.printAddingUsers(AddUsers.TELEPHONE_NUMBER);
        int telephoneNumber = in.nextInt();
        MenuController.printAddingUsers(AddUsers.MONEY_NUMBER);
        double moneyNumber = in.nextDouble();
        if (checkPhoneNumber(userArrayList, telephoneNumber)) {
            return new User(name, surname, telephoneNumber, moneyNumber);
        } else {
            throw new PhoneNumberException(telephoneNumber);
        }
    }

    private static boolean checkPhoneNumber(ArrayList<User> userArrayList, int phoneNumber) {
        for (User user : userArrayList) {
            if (user.getTelephoneNumber() == phoneNumber) {
                return false;
            }
        }
        return true;
    }

}
