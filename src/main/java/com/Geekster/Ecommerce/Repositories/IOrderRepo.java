package com.Geekster.Ecommerce.Repositories;

import com.Geekster.Ecommerce.Models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<OrderItem, Integer> {
}
