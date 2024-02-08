package com.github.khorm247;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

public class Product {

    // ### ATTRIBUTES ###
    private String description;
    private int quality;
    private Optional<Date> expirationDate;
    private final BigDecimal basePrice;
    private Date storedAtDate;


    // ### Constructors ###
    public Product(String description, int quality, Optional<Date> expirationDate, BigDecimal basePrice) {
        this.description = description;
        this.quality = quality;
        this.expirationDate = expirationDate;
        this.basePrice = basePrice;
    }

    // ### Methods ###

    // ### Getters and Setters ###

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Optional<Date> getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Optional<Date> expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }


    // ### toString() ###
    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", quality=" + quality +
                ", expirationDate=" + expirationDate +
                ", price=" + basePrice +
                '}';
    }

    // ### equals() & hash ###

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quality == product.quality && Objects.equals(description, product.description) && Objects.equals(expirationDate, product.expirationDate) && Objects.equals(basePrice, product.basePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, quality, expirationDate, basePrice);
    }
}
