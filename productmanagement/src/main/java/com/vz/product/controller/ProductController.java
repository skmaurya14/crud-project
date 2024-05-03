package com.vz.product.controller;

import com.vz.product.entity.Product;
import com.vz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(@RequestParam int page) {
        return productService.getAllProducts();
    }

//    @GetMapping("/category/{categoryId}")
//    public List<Product> getProductsByCategoryId(@PathVariable Long categoryId) {
//        return productService.getProductsByCategoryId(categoryId);
//    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }
}
