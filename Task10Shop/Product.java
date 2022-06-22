package com.company.Task10Shop;

public class Product {
    private final String name;
    private int numberOfProducts;
    private int cost;

    Product(String name, int numberOfProducts, int cost) {
        this.name = name;
        this.numberOfProducts = numberOfProducts;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
