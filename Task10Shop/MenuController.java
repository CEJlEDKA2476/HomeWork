package com.company.Task10Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {

    MenuController() {
    }

    public void outputUsers(ArrayList<User> userArrayList) {

        System.out.println("Покупатели: ");
        for (int i = 0; i < userArrayList.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            User user = userArrayList.get(i);

            stringBuilder.append(i + 1)
                    .append(". ")
                    .append(user.getName())
                    .append(" ")
                    .append(user.getSurname())
                    .append("\n")
                    .append(user.getTelephoneNumber())
                    .append("\n")
                    .append(user.getMoneyNumber())
                    .append(" рублей");
            System.out.println(stringBuilder);
        }
    }

    public void outputProducts(ArrayList<Product> productArrayList) {
        System.out.println("Продукты: ");
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println((i + 1) + ". " +
                    productArrayList.get(i).getName() + "\n" +
                    productArrayList.get(i).getNumberOfProducts() + " штук\n" +
                    productArrayList.get(i).getCost() + " рублей");
        }
    }

    public int choiceUser() {
        System.out.println("Выберите покупателя.");
        Scanner in = new Scanner(System.in);
        return in.nextInt() - 1;
    }

    public int choiceProduct() {
        System.out.println("Выберите продукт.");
        Scanner in = new Scanner(System.in);
        return in.nextInt() - 1;
    }

    public int numberOfBuyingProducts() {
        System.out.println("Введите количество покупаемого продукта.");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public int ifEnd() {
        System.out.print("0 - Закончить покупки.\n1 - Продолжить покупки.");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public int ifEndUsers() {
        System.out.print("0 - Закончить ввод.\n1 - Продолжить ввод.");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public void wrongPhoneNumber(){
        System.out.println("Введен неверный номер!");
    }

    public void printPurchaseResult(PurchaseResult purchaseResult) {
        switch (purchaseResult){
            case SUCCESS:
                System.out.println("Покупка выполнена успешно.");
                break;
            case NO_PRODUCTS:
                System.out.println("Не хватает продуктов.");
                break;
            case NO_MONEY:
                System.out.println("Не хватает денег.");
                break;
            case WRONG_AMOUNT:
                System.out.println("Введено неверное количество.");
                break;
        }
    }

    public boolean ifAddNewUser() {
        System.out.print("0 - Закончить ввод.\n1 - Ввести нового покупателя\n");
        Scanner in = new Scanner(System.in);
        return in.nextInt() == 1;
    }

    public static void printAddingUsers(AddUsers addUsers) {
        switch (addUsers){
            case NAME:
                System.out.println("Введите имя.");
                break;
            case SURNAME:
                System.out.println("Введите фамилию");
                break;
            case MONEY_NUMBER:
                System.out.println("Введите количество денег.");
                break;
            case TELEPHONE_NUMBER:
                System.out.println("Введите номер телефона.");
                break;
        }
    }
}
