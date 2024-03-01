package com.turkcell.spring.starter.Repositories.Concretes;

import com.turkcell.spring.starter.Entities.Product;
import com.turkcell.spring.starter.Repositories.Abstracts.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class SqlProductRepositoryImpl implements ProductRepository {

    private List<Product>productList = new ArrayList<>();
    @Override
    public void add(Product product) {
        if(product.getUnitPrice() < 0){
            throw new RuntimeException("Unit price cannot be less than 0");
        }
        productList.add(product);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
