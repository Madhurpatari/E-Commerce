# Spring Boot Project Ecommerce API
This is a Spring-based API for an ecommerce application, providing functionality for managing users, products, addresses, and orders. 
The API is built using Java and MySQL.

## Technologies Used
* Spring Boot 
* MySQL 
* Java 17
* Maven 
* Postman 


## Installation
To run this application locally, you will need to have Java 11, MySQL 8.0.25, and Maven 3.6.3 installed on your machine.

* Clone the repository to your local machine.
* Open the project in your preferred IDE (e.g., IntelliJ IDEA or Eclipse).
* Open the application.properties file and update the database configuration settings as needed for your local environment.
* Open Postman or your preferred API testing tool and send requests to http://localhost:8080/api/.

## Getting Started
To get started with the API, you'll need to have Java and MySQL installed on your system.
You'll also need to create a MySQL database and update the app.properties file with your database configuration details.


This will start the application on port 8080 by default. You can then access the API endpoints by sending HTTP requests to `http://localhost:8080.`

## API Endpoints
Here's a summary of the API endpoints provided by this application:

## Users

* GET /users/{id} - Retrieve a user by ID
* POST /users - Create a new user

## Products

* GET /products - Retrieve all products
* GET /products/{id} - Retrieve a product by ID
* POST /products - Create a new product
* DELETE /products/{id} - Delete a product by ID

## Addresses

* GET /addresses/{id} - Retrieve an address by ID
* POST /addresses - Create a new address

## Orders

* GET /orders/{id} - Retrieve an order by ID
* POST /orders - Place a new order

## Contributing
If you'd like to contribute to this project, you can do so by submitting a pull request. 
Please make sure to follow the existing coding style and conventions when submitting your changes.
