package com.vesturecommerce.domain.product.model;

import java.math.BigDecimal;

public record Price(BigDecimal amount) {
    public Price {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("The price must be greater than zero.");
        }
    }
}