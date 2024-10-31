package com.sharath.SimpleWebApp.service;

import com.sharath.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "iphone", 50000), new Product(102,"camera", 70000), new Product(103,"shrue mic", 10000)));

    public List<Product> getProducts() {
        return products;
    }


    public Product getProductBy(int productId) {
        return products.stream()
                .filter(p -> p.getProdId() == productId)
                .findFirst()
                .orElse(new Product(productId,"not found",0));

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProdId() == product.getProdId()) {
                products.set(i, product);
            }
        }
    }

    public void deleteProductById(int productId) {
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProdId() == productId) {
                products.remove(i);
            }
        }
    }
}
