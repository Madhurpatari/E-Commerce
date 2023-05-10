package com.Geekster.Ecommerce.Services;

import com.Geekster.Ecommerce.Models.Address;
import com.Geekster.Ecommerce.Models.OrderItem;
import com.Geekster.Ecommerce.Models.Product;
import com.Geekster.Ecommerce.Models.User;
import com.Geekster.Ecommerce.Repositories.IAddressRepo;
import com.Geekster.Ecommerce.Repositories.IOrderRepo;
import com.Geekster.Ecommerce.Repositories.IProductRepo;
import com.Geekster.Ecommerce.Repositories.IUserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private IOrderRepo orderRepo;
    @Autowired
    private IAddressRepo addressRepo;
    @Autowired
    private IProductRepo productRepo;
    @Autowired
    private IUserRepo userRepo;

    //Create an OrderItem
    public OrderItem createOrderItem(OrderItem orderItem) {

        Integer addressID = orderItem.getAddress().getAddressId();
        Optional<Address> optionalAddress= addressRepo.findById(addressID);
        if(optionalAddress.isPresent()){
            orderItem.setAddress( optionalAddress.get());
        }else{
            throw new EntityNotFoundException("Address with id : " + addressID + " not found");
        }


        Integer productId = orderItem.getProduct().getProductId();
        Optional<Product> optionalProduct= productRepo.findById(productId);
        if(optionalProduct.isPresent()){
            orderItem.setProduct(optionalProduct.get());
        }else{
            throw new EntityNotFoundException("Product with id : " + productId + " not found");
        }

        Integer userId = orderItem.getUser().getUserId();
        Optional<User> optionalUser= userRepo.findById(userId);
        if(optionalUser.isPresent()){
            orderItem.setUser(optionalUser.get());
        }else{
            throw new EntityNotFoundException("User with id : " + userId + " not found");
        }

        return orderRepo.save(orderItem);
    }

    //Get an order by orderId
    public OrderItem getOrderById(Integer orderId) {
        return orderRepo.findById(orderId)
                .orElseThrow(()->new EntityNotFoundException("Order with Id : "+orderId + " not found"));
    }
}
