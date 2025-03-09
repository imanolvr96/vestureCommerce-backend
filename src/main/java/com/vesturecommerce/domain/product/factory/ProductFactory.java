package com.vesturecommerce.domain.product.factory;

import com.vesturecommerce.domain.product.model.Price;
import com.vesturecommerce.domain.product.model.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class ProductFactory {
    public static Product create(String name, String description, Price price, int stock) {
        if (price.amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("The price must be greater than zero.");
        }

        return new Product(UUID.randomUUID(), name, description, price, stock, LocalDateTime.now());
    }
}
