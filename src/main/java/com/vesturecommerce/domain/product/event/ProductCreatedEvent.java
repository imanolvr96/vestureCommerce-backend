package com.vesturecommerce.domain.product.event;

import com.vesturecommerce.domain.product.model.Product;

import java.time.Instant;

public record ProductCreatedEvent(Product product, Instant occurredAt) {
    public ProductCreatedEvent(Product product) {
        this(product, Instant.now());
    }
}