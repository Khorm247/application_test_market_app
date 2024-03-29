package com.github.khorm247.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;


public abstract class Product {
    protected String description;
    protected int quality;
    protected Optional<LocalDate> expirationDate;
    protected BigDecimal basePrice;

    public Product(String description, int quality, Optional<LocalDate> expirationDate, BigDecimal basePrice) {
        this.description = description;
        this.quality = quality;
        this.expirationDate = expirationDate;
        this.basePrice = basePrice;
    }

    public abstract void updateQualityAndPrice();
    public abstract boolean shouldBeDisposed();

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", quality=" + quality +
                ", expirationDate=" + expirationDate +
                ", basePrice=" + basePrice +
                '}';
    }
}