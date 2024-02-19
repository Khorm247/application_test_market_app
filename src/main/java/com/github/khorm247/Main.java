package com.github.khorm247;

import com.github.khorm247.model.Cheese;
import com.github.khorm247.model.Product;
import com.github.khorm247.model.Wine;
import com.github.khorm247.service.Supermarket;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();


        // Fügen Sie 5 Käseprodukte hinzu
        for (int i = 1; i <= 10; i++) {
            productList.add(new Cheese(
                    "Käse " + i,
                    getRandomQuality(),
                    Optional.of(getFutureDate()),
                    BigDecimal.valueOf(i * 2)));
        }

        // Fügen Sie 5 Weinprodukte hinzu
        for (int i = 1; i <= 10; i++) {
            productList.add(new Wine(
                    "Wein " + i,
                    getRandomQuality(),
                    Optional.of(LocalDate.now()),
                    BigDecimal.valueOf(i * 2)));
        }

        Supermarket supermarket = new Supermarket(productList);
        supermarket.printProducts();

    }

    public static LocalDate getFutureDate() {
        int randomNum = ThreadLocalRandom.current().nextInt(50, 101);
        return LocalDate.now().plusDays(randomNum);
    }

    public static int getRandomQuality() {
        return ThreadLocalRandom.current().nextInt(-10, 101);
    }
}