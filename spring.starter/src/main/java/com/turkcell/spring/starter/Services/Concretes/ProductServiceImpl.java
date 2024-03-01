package com.turkcell.spring.starter.Services.Concretes;

import com.turkcell.spring.starter.Entities.Product;
import com.turkcell.spring.starter.Services.Abstracts.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    

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
