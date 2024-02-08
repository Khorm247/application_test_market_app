package com.github.khorm247;

import java.math.BigDecimal;

public interface Ruleset {
    public void applyRules(Product product);
    BigDecimal getCurrentPrice(Product product);
}
