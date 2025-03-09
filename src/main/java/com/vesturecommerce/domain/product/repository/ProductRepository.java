package com.vesturecommerce.domain.product.repository;

import com.vesturecommerce.domain.product.model.Product;

import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {
    Optional<Product> findById(UUID id);

    void save(Product product);

    void deleteById(UUID id);
}