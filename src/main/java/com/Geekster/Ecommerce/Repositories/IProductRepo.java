package com.Geekster.Ecommerce.Repositories;

import com.Geekster.Ecommerce.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product, Integer> {

    //custom finder for getting product based on category
    List<Product> findByCategory(String category);
}
