package com.product.controller;

import bean.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/info/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return new Product(productId, "红薯", 3);
    }
}
