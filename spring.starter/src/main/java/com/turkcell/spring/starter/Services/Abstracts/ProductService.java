package com.turkcell.spring.starter.Services.Abstracts;

import com.turkcell.spring.starter.Entities.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
