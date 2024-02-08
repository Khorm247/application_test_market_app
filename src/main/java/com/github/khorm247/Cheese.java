package com.github.khorm247;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

public class Cheese extends Product implements Ruleset{

    public Cheese(String description, int quality, Optional<Date> expirationDate, BigDecimal basePrice) {
        super(description, quality, expirationDate, basePrice);
    }
}
