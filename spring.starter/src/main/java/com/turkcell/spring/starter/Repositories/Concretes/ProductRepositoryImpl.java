package com.turkcell.spring.starter.Repositories.Concretes;

import com.turkcell.spring.starter.Entities.Product;
import com.turkcell.spring.starter.Repositories.Abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public void add(Product product) {
        if(product.getUnitPrice() < 0){
            throw new RuntimeException("Unit price cannot be less than 0");
        }
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
