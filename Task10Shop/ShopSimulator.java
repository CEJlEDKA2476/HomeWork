package com.company.Task10Shop;

public class ShopSimulator {

    ShopSimulator() {
    }


    private boolean checkAmount(Product product, int amount) {
        return product.getNumberOfProducts() != 0 && product.getNumberOfProducts() - amount >= 0;
    }

    private boolean checkMoney(User user, Product product, int amount) {
        return amount != 0 && user.getMoneyNumber() >= product.getCost() * amount;
    }

    public PurchaseResult purchase(User user, Product product, int amount) {
        if (checkAmount(product, amount)) {
            if (checkMoney(user, product, amount)) {
                if (amount > 0) {
                    user.setMoneyNumber(getFinalMoney(user.getMoneyNumber(), product.getCost(), amount));
                    product.setNumberOfProducts(finalNumberOfProducts(product.getNumberOfProducts(), amount));
                    return PurchaseResult.SUCCESS;
                } else {
                    return PurchaseResult.WRONG_AMOUNT;
                }
            } else {
                return PurchaseResult.NO_MONEY;
            }
        } else {
            return PurchaseResult.NO_PRODUCTS;
        }
    }

    private double getFinalMoney (double userMoney, double productCost, int amount) {
        return userMoney - productCost * amount;
    }

    private int finalNumberOfProducts (int numberOfProducts, int amount){
        return numberOfProducts - amount;
    }
}
