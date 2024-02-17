package com.github.khorm247.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

public class Cheese extends Product {
    public Cheese(String description, int quality, Optional<Date> expirationDate, BigDecimal basePrice) {
        super(description, quality, expirationDate, basePrice);
    }

    @Override
    public void updateQualityAndPrice() {
        // Implementieren Sie die spezifischen Regeln für Käse
    }

    @Override
    public boolean shouldBeDisposed() {
        // Implementieren Sie die spezifischen Regeln für Käse
        return false;
    }
}
