package com.github.khorm247.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

public class Wine extends Product {
    public Wine(String description, int quality, Optional<Date> expirationDate, BigDecimal basePrice) {
        super(description, quality, expirationDate, basePrice);
    }

    @Override
    public void updateQualityAndPrice() {
        // Implementieren Sie die spezifischen Regeln für Wein
    }

    @Override
    public boolean shouldBeDisposed() {
        // Implementieren Sie die spezifischen Regeln für Wein
        return false;
    }
}
