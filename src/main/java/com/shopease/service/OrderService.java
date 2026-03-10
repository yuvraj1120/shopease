package com.shopease.service;

import com.shopease.model.Order;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public Order placeOrder(String userId, List<Long> productIds, Double totalAmount) {
        Order order = new Order(userId, productIds, totalAmount);
        order.setId((long) (orders.size() + 1));
        orders.add(order);
        return order;
    }

    public Optional<Order> getOrderById(Long id) {
        return orders.stream().filter(o -> o.getId().equals(id)).findFirst();
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
