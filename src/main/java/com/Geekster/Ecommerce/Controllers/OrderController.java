package com.Geekster.Ecommerce.Controllers;

import com.Geekster.Ecommerce.Models.OrderItem;
import com.Geekster.Ecommerce.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    //Post an Order Item
    @PostMapping
    public OrderItem createOrder(@RequestBody OrderItem orderItem) {
        return orderService.createOrderItem(orderItem);
    }


    //Get order by OrderId
    @GetMapping("/{orderId}")
    public OrderItem getOrderById(@PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }
}
