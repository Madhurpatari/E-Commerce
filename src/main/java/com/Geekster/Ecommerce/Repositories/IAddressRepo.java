package com.Geekster.Ecommerce.Repositories;

import com.Geekster.Ecommerce.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
