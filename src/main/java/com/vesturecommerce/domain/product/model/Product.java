package com.vesturecommerce.domain.product.model;

import java.time.LocalDateTime;
import java.util.UUID;

public record Product(UUID id, String name, String description, Price price, int stock, LocalDateTime createdAt) {
}
