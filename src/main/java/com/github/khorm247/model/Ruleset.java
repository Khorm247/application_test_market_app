package com.github.khorm247.model;

import com.github.khorm247.model.Product;

import java.math.BigDecimal;

public interface Ruleset {
    public void applyRules(Product product);
    BigDecimal getCurrentPrice(Product product);
}
