package com.philips.ecommerce.dto;

import java.time.LocalDateTime;

public class OrderResponse {

    private Long orderId;

    private String customerName;

    private String productName;

    private Integer quantity;

    private Double totalPrice;

    private LocalDateTime orderDate;

    private String message;

    // ---------- Constructors ----------

    public OrderResponse() {
    }

    public OrderResponse(Long orderId, String customerName, String productName,
                         Integer quantity, Double totalPrice,
                         LocalDateTime orderDate, String message) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.message = message;
    }

    // ---------- Getters & Setters ----------

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}