package com.igor.ecommerce.ProductService.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public String createProduct() {
        return "HTTP POST request handled";
    }

    @GetMapping
    public String getProduct() {
        return "HTTP GET request handled";
    }

    @PutMapping
    public String modifyProduct() {
        return "HTTP PUT request handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE request handled";
    }
}
