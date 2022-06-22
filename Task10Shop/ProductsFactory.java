package com.company.Task10Shop;

import java.util.ArrayList;

public class ProductsFactory {

    public static ArrayList<Product> generateGoods() {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product("Snickers", 100, 20));
        productArrayList.add(new Product("KitKat", 23, 15));
        productArrayList.add(new Product("Doshik", 999, 1));
        productArrayList.add(new Product("Mars", 2, 13));
        productArrayList.add(new Product("Twix", 50, 10));

        return productArrayList;
    }
}
