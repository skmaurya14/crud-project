package com.vz.product.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private double price;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable =false)
    private Category category;

}
