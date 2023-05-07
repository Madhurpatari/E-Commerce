package com.Geekster.Ecommerce.Services;

import com.Geekster.Ecommerce.Models.Address;
import com.Geekster.Ecommerce.Models.OrderItem;
import com.Geekster.Ecommerce.Models.User;
import com.Geekster.Ecommerce.Repositories.IUserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    //Create User
    public User addUser(User user) {

        return userRepo.save(user);
    }

    //get User by userID
    public User getUserById(Integer userId) {
        return userRepo.findById(userId)
                .orElseThrow(()->new EntityNotFoundException("User with ID : "+userId+" not found"));
    }

}
