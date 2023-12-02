package com.examlple.inventoryservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orderservice.Order;
import com.example.orderservice.OrderItem;
 
@Component
public class InventoryListener {
 
    @Autowired
    private InventoryService inventoryService;
 
    @RabbitListener(queues = "order-queue")
    public void processOrder(Order order) {
        System.out.println("Received order: " + order);
 
        // Assuming orderItems have productId and quantity information
        for (OrderItem orderItem : order.getOrderItems()) {
            Long productId = orderItem.getProductId();
            int quantity = orderItem.getQuantity();
 
            // Update inventory based on the order
            inventoryService.updateInventory(productId, quantity);
        }
 
        System.out.println("Inventory updated for order: " + order.getId());
    }
}
