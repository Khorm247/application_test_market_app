package com.github.khorm247;

import com.github.khorm247.model.Cheese;
import com.github.khorm247.model.Product;
import com.github.khorm247.model.Wine;
import com.github.khorm247.service.Supermarket;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        // Erstellen Sie Daten für das Verfallsdatum
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 60); // 60 Tage in der Zukunft
        Date expirationDate = calendar.getTime();

        // Fügen Sie 5 Käseprodukte hinzu
        for (int i = 1; i <= 5; i++) {
            productList.add(new Cheese("Käse " + i, i * 10, Optional.of(expirationDate), BigDecimal.valueOf(i * 2)));
        }

        // Fügen Sie 5 Weinprodukte hinzu
        for (int i = 1; i <= 5; i++) {
            productList.add(new Wine("Wein " + i, i * 10, Optional.empty(), BigDecimal.valueOf(i * 2)));
        }

        Supermarket supermarket = new Supermarket(productList);
        supermarket.printProducts();
    }
}