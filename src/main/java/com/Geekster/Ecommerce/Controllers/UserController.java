package com.Geekster.Ecommerce.Controllers;

import com.Geekster.Ecommerce.Models.Address;
import com.Geekster.Ecommerce.Models.User;
import com.Geekster.Ecommerce.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //Create User
    @PostMapping
    public User createUser(@RequestBody User user){
        List<Address> addressList = user.getAddresses();
        for(Address address :  addressList)
        {
            address.setUser(user);
        }
        return userService.addUser(user);
    }

    //Get user using user_id
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
}
