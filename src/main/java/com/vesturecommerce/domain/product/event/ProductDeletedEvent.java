package com.vesturecommerce.domain.product.event;

import java.time.Instant;
import java.util.UUID;

public record ProductDeletedEvent(UUID productId, Instant occurredAt) {
    public ProductDeletedEvent(UUID productId) {
        this(productId, Instant.now());
    }
}