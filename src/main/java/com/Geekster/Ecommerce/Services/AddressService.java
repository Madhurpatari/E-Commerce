package com.Geekster.Ecommerce.Services;

import com.Geekster.Ecommerce.Models.Address;
import com.Geekster.Ecommerce.Repositories.IAddressRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo addressRepo;

    //create an address
    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    //Get address by using ID
    public Address getAddressById(Integer addressId) {
        return addressRepo.findById(addressId)
                .orElseThrow(()->new EntityNotFoundException("Address with id : "+ addressId + " not found"));
    }
}
