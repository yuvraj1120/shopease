package com.shopease;

import com.shopease.controller.ProductController;
import com.shopease.controller.CartController;
import com.shopease.controller.OrderController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ShopEaseApplicationTests {

    @Autowired
    private ProductController productController;

    @Autowired
    private CartController cartController;

    @Autowired
    private OrderController orderController;

    @Test
    void contextLoads() {
        // Verifies the Spring application context starts without errors
        assertThat(productController).isNotNull();
        assertThat(cartController).isNotNull();
        assertThat(orderController).isNotNull();
    }

    @Test
    void productsEndpointReturnsData() {
        // Verifies the products endpoint returns the seeded products
        var response = productController.getAllProducts();
        assertThat(response.getBody()).isNotEmpty();
        assertThat(response.getBody().size()).isGreaterThanOrEqualTo(3);
    }
}

