package com.vz.product.repository;

import com.vz.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,  Long> {
}
