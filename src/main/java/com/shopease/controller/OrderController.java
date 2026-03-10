package com.shopease.controller;

import com.shopease.model.Order;
import com.shopease.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // POST /order/place — Place a new order
    // Body: { "userId": "user1", "productIds": [1,2], "totalAmount": 95000 }
    @PostMapping("/place")
    public ResponseEntity<Order> placeOrder(@RequestBody Map<String, Object> request) {
        String userId = (String) request.get("userId");
        List<Integer> rawIds = (List<Integer>) request.get("productIds");
        List<Long> productIds = rawIds.stream().map(Long::valueOf).toList();
        Double totalAmount = Double.valueOf(request.get("totalAmount").toString());

        Order order = orderService.placeOrder(userId, productIds, totalAmount);
        return ResponseEntity.ok(order);
    }

    // GET /order/{id} — Get order by ID
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /order/all — Get all orders
    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }
}