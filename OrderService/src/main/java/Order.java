package com.example.orderservice;

import java.math.BigDecimal;
import java.util.List;

import com.example.orderservice.OrderItem;
 
public class Order {
    
    private Long id;
    private String customerName;
    private List<OrderItem> orderItems;
    private BigDecimal totalAmount;
    
    // Constructors, getters, and setters
    
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
this.id = id;
    }
 
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
 
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
 
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
 
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
 
    // Additional methods, if needed
    
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderItems=" + orderItems +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
