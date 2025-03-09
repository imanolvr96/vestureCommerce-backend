package com.vesturecommerce.domain.product.aggregate;

import com.vesturecommerce.domain.product.factory.ProductFactory;
import com.vesturecommerce.domain.product.model.Price;
import com.vesturecommerce.domain.product.model.Product;
import com.vesturecommerce.domain.product.repository.ProductRepository;
import com.vesturecommerce.domain.product.validator.ProductValidator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class ProductAggregate {
    private final ProductRepository productRepository;

    public ProductAggregate(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(String name, String description, BigDecimal price, int stock) {
        ProductValidator.validate(new Product(UUID.randomUUID(), name, description, new Price(price), stock, LocalDateTime.now()));
        Product product = ProductFactory.create(name, description, new Price(price), stock);
        productRepository.save(product);
        return product;
    }
}
