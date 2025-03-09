package com.vesturecommerce.domain.product.service;

import com.vesturecommerce.domain.product.event.ProductCreatedEvent;
import com.vesturecommerce.domain.product.event.ProductDeletedEvent;
import com.vesturecommerce.domain.product.event.ProductUpdatedEvent;
import com.vesturecommerce.domain.product.model.Product;
import com.vesturecommerce.domain.product.repository.ProductRepository;
import com.vesturecommerce.domain.product.validator.ProductValidator;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductCreatedEvent createProduct(Product product) {
        ProductValidator.validate(product);
        productRepository.save(product);
        return new ProductCreatedEvent(product, Instant.now());
    }

    public Optional<Product> findProductById(UUID id) {
        return productRepository.findById(id);
    }

    public ProductUpdatedEvent updateProduct(Product product) {
        ProductValidator.validate(product);
        productRepository.save(product);
        return new ProductUpdatedEvent(product, Instant.now());
    }

    public ProductDeletedEvent deleteProduct(UUID id) {
        productRepository.deleteById(id);
        return new ProductDeletedEvent(id, Instant.now());
    }
}