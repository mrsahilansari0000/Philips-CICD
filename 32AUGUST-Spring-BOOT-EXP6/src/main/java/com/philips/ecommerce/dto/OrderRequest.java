package com.philips.ecommerce.dto;

public class OrderRequest {

    private String customerName;

    private String productName;

    private Integer quantity;

    private Double totalPrice;

    // ---------- Constructors ----------

    public OrderRequest() {
    }

    public OrderRequest(String customerName, String productName,
                        Integer quantity, Double totalPrice) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // ---------- Getters & Setters ----------

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
}