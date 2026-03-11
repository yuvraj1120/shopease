package com.shopease.service;

import com.shopease.model.Cart;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private List<Cart> carts = new ArrayList<>();

    public Cart getOrCreateCart(String userId) {
        return carts.stream()
                .filter(c -> c.getUserId().equals(userId))
                .findFirst()
                .orElseGet(() -> {
                    Cart newCart = new Cart(userId);
                    carts.add(newCart);
                    return newCart;
                });
    }

    public Cart addToCart(String userId, Long productId) {
        Cart cart = getOrCreateCart(userId);
        cart.getProductIds().add(productId);
        return cart;
    }

    public List<Cart> getAllCarts() {
        return carts;
    }
}