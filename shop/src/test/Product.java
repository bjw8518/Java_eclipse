package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String name;
    private int price;
    private int stock;
    private double discountRate;

    public Product(String name, int price, int stock, double discountRate) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int DiscountedPrice() {
        return (int)(price * (1 - discountRate));
    }
}

