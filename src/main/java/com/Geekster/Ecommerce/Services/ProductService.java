package com.Geekster.Ecommerce.Services;

import com.Geekster.Ecommerce.Models.Product;
import com.Geekster.Ecommerce.Repositories.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    //Adding a product
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    //Get all products
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    //Get products based on category
    public List<Product> getProductsByCategory(String category) {
        return productRepo.findByCategory(category);
    }


    //Delete Product using productId
    public ResponseEntity<Void> deleteProduct(Integer productId) {
        Optional<Product> optionalProduct = productRepo.findById(productId);
        if(optionalProduct.isPresent()){
            productRepo.deleteById(productId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
