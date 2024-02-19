package com.github.khorm247.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public class Cheese extends Product {
    public Cheese(String description, int quality, Optional<LocalDate> expirationDate, BigDecimal basePrice) {
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

/*
- Der Tagespreis wird durch Qualität bestimmt: Grundpreis +0,10€ * Qualität
- Käse benötigt ein minimales Qualitätsniveau von 30, um im Regal eingeräumt zu werden, bzw. wird ausgeräumt
- sobald die Qualität unter 30 sinkt.
- Käse hat ein Verfallsdatum, das zwischen 50 und 100 Tagen in der Zukunft liegt.
- Käse verliert täglich einen Qualitätspunkt.
- Käse hat einen tagesaktuellen Preis.
 */
