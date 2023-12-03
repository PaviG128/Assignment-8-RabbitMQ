# Microservices with RabbitMQ
 
This repository contains two Spring Boot microservices, OrderService, and InventoryService, communicating through RabbitMQ.
 
## OrderService
# Dependencies
- Spring Boot
- Spring Web
- Spring AMQP
 
# Endpoints
POST /placeOrder: Place a new order by sending order details in the request body.

## InventoryService
# Dependencies
- Spring Boot
- Spring Web
- Spring AMQP

# Listener
Listens to the order-queue for incoming orders and updates the inventory.

## Setup Instructions
- Clone the repository:git clone https://github.com/PaviG128/Assignment-8-RabbitMQ.git
- Configure RabbitMQ : Update RabbitMQ details in both OrderService and InventoryService properties.
- Test the Microservices : Check RabbitMQ Management Interface for queues and exchanges.
