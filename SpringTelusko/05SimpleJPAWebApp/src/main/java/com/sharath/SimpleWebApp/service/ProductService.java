package com.sharath.SimpleWebApp.service;

import com.sharath.SimpleWebApp.model.Product;
import com.sharath.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;



    public List<Product> getProducts() {
        return repo.findAll();
    }


    public Product getProductById(int productId) {
        return repo.findById(productId).get();

    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProductById(int productId) {
        repo.deleteById(productId);
    }
}
