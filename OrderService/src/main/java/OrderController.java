package com.example.orderservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@PostMapping("/placeOrder")
	public ResponseEntity<String> placeOrder(@RequestBody Order order) {
	 // Convert order to JSON
	 // Send to RabbitMQ
	 rabbitTemplate.convertAndSend("order-queue", order);
	 return ResponseEntity.ok("Order placed successfully");
	}

}