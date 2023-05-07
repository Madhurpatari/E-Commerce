package com.Geekster.Ecommerce.Controllers;

import com.Geekster.Ecommerce.Models.Product;
import com.Geekster.Ecommerce.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    //Create Products
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    //Get all products
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    //Get products based on category (query params)
    @GetMapping(params = "category")
    public List<Product> getProductsByCategory(@RequestParam String category){
        return productService.getProductsByCategory(category);
    }

    //Delete Product using productId
    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer productId) {
        return productService.deleteProduct(productId);
    }
}
