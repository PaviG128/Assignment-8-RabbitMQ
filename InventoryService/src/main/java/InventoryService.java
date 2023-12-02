package com.examlple.inventoryservice;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
 
@Service
public class InventoryService {
 
    // Simulating an in-memory inventory storage
    private Map<Long, Integer> inventory = new HashMap<>();
 
    // Constructor, if needed
 
    public void updateInventory(Long productId, int quantity) {
        int currentQuantity = inventory.getOrDefault(productId, 0);
 
        // Ensure the inventory won't go negative
        if (currentQuantity + quantity >= 0) {
            inventory.put(productId, currentQuantity + quantity);
            System.out.println("Inventory updated for product " + productId + ": " + inventory.get(productId));
        } else {
            System.out.println("Error: Insufficient inventory for product " + productId);
        }
    }
 
}