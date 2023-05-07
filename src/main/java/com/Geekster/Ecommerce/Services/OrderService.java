package com.Geekster.Ecommerce.Services;

import com.Geekster.Ecommerce.Models.OrderItem;
import com.Geekster.Ecommerce.Repositories.IOrderRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private IOrderRepo orderRepo;

    //Create an OrderItem
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderRepo.save(orderItem);
    }

    //Get an order by order Id
    public OrderItem getOrderById(Integer orderId) {
        return orderRepo.findById(orderId)
                .orElseThrow(()->new EntityNotFoundException("Order with Id : "+orderId + " not found"));
    }
}
