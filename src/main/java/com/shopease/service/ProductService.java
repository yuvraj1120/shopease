package com.shopease.service;

import com.shopease.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    // Using in-memory list for simplicity (JPA repo added in later days)
    private List<Product> products = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong(1);

    public ProductService() {
        // Seed some sample products on startup
        Product p1 = new Product("Laptop", "15-inch gaming laptop", 75000.0, 10);
        p1.setId(idCounter.getAndIncrement());
        products.add(p1);

        Product p2 = new Product("Phone", "Android smartphone 128GB", 20000.0, 25);
        p2.setId(idCounter.getAndIncrement());
        products.add(p2);

        Product p3 = new Product("Headphones", "Wireless noise-cancelling", 5000.0, 50);
        p3.setId(idCounter.getAndIncrement());
        products.add(p3);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public Product addProduct(Product product) {
        product.setId(idCounter.getAndIncrement());
        products.add(product);
        return product;
    }
}