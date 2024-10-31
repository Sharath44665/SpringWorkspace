package com.sharath.SimpleWebApp.controller;

import com.sharath.SimpleWebApp.model.Product;
import com.sharath.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getProductId(@PathVariable int productId) {
        return service.getProductById(productId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        System.out.println(product.getProdId());
        System.out.println(product.getProdName());
        System.out.println(product.getPrice());
        service.addProduct(product);
    }


    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {

        service.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId) {
        service.deleteProductById(productId);

    }
}
