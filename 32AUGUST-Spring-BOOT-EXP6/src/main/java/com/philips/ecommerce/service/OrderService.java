package com.philips.ecommerce.service;

import com.philips.ecommerce.dto.OrderRequest;
import com.philips.ecommerce.dto.OrderResponse;
import com.philips.ecommerce.entity.OrderEntity;
import com.philips.ecommerce.repository.OrderRepository;
import com.philips.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderResponse placeOrder(OrderRequest request) {

        // Map Request -> Entity
        OrderEntity order = new OrderEntity();
        order.setCustomerName(request.getCustomerName());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setTotalPrice(request.getTotalPrice());
        order.setOrderDate(LocalDateTime.now());

        // Save to DB
        OrderEntity saved = orderRepository.save(order);

        // Map Entity -> Response
        OrderResponse response = new OrderResponse();
        response.setOrderId(saved.getId());
        response.setCustomerName(saved.getCustomerName());
        response.setProductName(saved.getProductName());
        response.setQuantity(saved.getQuantity());
        response.setTotalPrice(saved.getTotalPrice());
        response.setOrderDate(saved.getOrderDate());
        response.setMessage("Order placed successfully");

        return response;
    }
}