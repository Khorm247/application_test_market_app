package com.github.khorm247.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public class Wine extends Product {

    private int maxQuality = 50;
    public Wine(String description, int quality, Optional<LocalDate> expirationDate, BigDecimal basePrice) {
        super(description, quality, expirationDate, basePrice);
        this.basePrice = basePrice.add((BigDecimal.valueOf(0.10).multiply(BigDecimal.valueOf(quality))));
    }

    @Override
    public void updateQualityAndPrice() {
        // Wein verliert nicht an Qualität, sondern gewinnt ab dem Stichtag alle 10 Tage
        //    +1 Qualität hinzu, bis die Qualität 50 erreicht ist.

        // Weine verändern ihren Preis nicht, nachdem sie ins Regal eingeräumt wurden.
    }

    @Override
    public boolean shouldBeDisposed() {
        // Wein verfällt nicht.
        // Für Wein wird jedes nicht-negative Qualitätsniveau akzeptiert.
        return false;
    }

    @Override
    public String toString() {
        return "Wine {" +
                "Beschreibung = '" + description + '\'' +
                ", Qualität = " + quality +
                ", Eingeräumt am = " + expirationDate.get() +
                ", Preis = " + basePrice +
                '}';
    }
}



/*
Für Wein wird jedes nicht-negative Qualitätsniveau akzeptiert.
Wein verliert nicht an Qualität, sondern gewinnt ab dem Stichtag alle 10 Tage
    +1 Qualität hinzu, bis die Qualität 50 erreicht ist.
Wein verfällt nicht.
Weine verändern ihren Preis nicht, nachdem sie ins Regal eingeräumt wurden.
 */
