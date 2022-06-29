package com.company.Task10Shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userArrayList = UsersFactory.generateUsers();
        ArrayList<Product> productArrayList = ProductsFactory.generateGoods();
        MenuController menuController = new MenuController();
        ShopSimulator shopSimulator = new ShopSimulator();
        int ifEnd;
        int ifEndUsers;

        do {
            do {
                if (menuController.ifAddNewUser()) {
                    try {
                        User user = UsersFactory.generateUser(userArrayList);
                        userArrayList.add(user);
                    } catch (PhoneNumberException e) {
                        e.printStackTrace();
                        e.getMessage();
                        menuController.wrongPhoneNumber();
                    }
                } else break;
                ifEndUsers = menuController.ifEndUsers();
            } while (ifEndUsers != 0);

            menuController.outputUsers(userArrayList);
            int choiceUser = menuController.choiceUser();
            menuController.outputProducts(productArrayList);
            PurchaseResult purchaseResult = shopSimulator.purchase(userArrayList.get(choiceUser),
                    productArrayList.get(menuController.choiceProduct()), menuController.numberOfBuyingProducts());
            menuController.printPurchaseResult(purchaseResult);
            ifEnd = menuController.ifEnd();
        } while (ifEnd != 0);
    }
}
