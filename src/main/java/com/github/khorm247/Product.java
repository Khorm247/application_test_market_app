package com.github.khorm247;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Product {

    // ### ATTRIBUTES ###
    private String description;
    private int quality;
    private Date expirationDate;
    private BigDecimal price;


    // ### Constructors ###
    public Product(String description, int quality, Date expirationDate, BigDecimal price) {
        this.description = description;
        this.quality = quality;
        this.expirationDate = expirationDate;
        this.price = price;
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

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    // ### toString() ###
    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", quality=" + quality +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                '}';
    }

    // ### equals() & hash ###

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quality == product.quality && Objects.equals(description, product.description) && Objects.equals(expirationDate, product.expirationDate) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, quality, expirationDate, price);
    }
}
