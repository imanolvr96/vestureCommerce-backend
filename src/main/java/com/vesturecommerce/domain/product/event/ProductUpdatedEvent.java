package com.vesturecommerce.domain.product.event;

import com.vesturecommerce.domain.product.model.Product;

import java.time.Instant;

public record ProductUpdatedEvent(Product product, Instant occurredAt) {
    public ProductUpdatedEvent(Product product) {
        this(product, Instant.now());
    }
}