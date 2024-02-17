package com.github.khorm247.service;

import com.github.khorm247.model.Product;

import java.util.List;

public class Supermarket {
    private List<Product> products;

    public Supermarket(List<Product> products) {
        this.products = products;
    }

    public void updateProducts() {
        for (Product product : products) {
            product.updateQualityAndPrice();
            if (product.shouldBeDisposed()) {
                products.remove(product);
            }
        }
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
