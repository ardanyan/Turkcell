package com.turkcell.spring.starter.Repositories.Abstracts;

import com.turkcell.spring.starter.Entities.Product;

import java.util.List;

public interface ProductRepository {
    void add(Product product);
    List<Product> getAll();
}
