package com.vesturecommerce.domain.product.validator;

import com.vesturecommerce.domain.product.model.Product;

import java.math.BigDecimal;

public class ProductValidator {
    public static void validate(Product product) {
        if (product.name() == null || product.name().isBlank()) {
            throw new IllegalArgumentException("The product name cannot be empty.");
        }
        if (product.stock() < 0) {
            throw new IllegalArgumentException("The stock cannot be negative.");
        }
        if (product.price() == null || product.price().amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("The price must be greater than zero.");
        }
    }
}
