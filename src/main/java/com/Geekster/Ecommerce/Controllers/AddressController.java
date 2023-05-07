package com.Geekster.Ecommerce.Controllers;

import com.Geekster.Ecommerce.Models.Address;
import com.Geekster.Ecommerce.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    //Post an address
    @PostMapping
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    //Get address using addressID
    @GetMapping("/{addressId}")
    public Address getAddressById(@PathVariable Integer addressId){
        return addressService.getAddressById(addressId);
    }
}
