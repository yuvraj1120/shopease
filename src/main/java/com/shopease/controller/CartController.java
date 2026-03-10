package com.shopease.controller;

import com.shopease.model.Cart;
import com.shopease.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // GET /cart?userId=user1 — Get cart for a user
    @GetMapping
    public ResponseEntity<Cart> getCart(@RequestParam String userId) {
        return ResponseEntity.ok(cartService.getOrCreateCart(userId));
    }

    // POST /cart/add — Add product to cart
    // Body: { "userId": "user1", "productId": 1 }
    @PostMapping("/add")
    public ResponseEntity<Cart> addToCart(@RequestBody Map<String, Object> request) {
        String userId = (String) request.get("userId");
        Long productId = Long.valueOf(request.get("productId").toString());
        Cart updatedCart = cartService.addToCart(userId, productId);
        return ResponseEntity.ok(updatedCart);
    }
}