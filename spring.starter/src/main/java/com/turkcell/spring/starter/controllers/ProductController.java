package com.turkcell.spring.starter.controllers;
import com.turkcell.spring.starter.Entities.Product;
import org.springframework.web.bind.annotation.*;
import com.turkcell.spring.starter.Services.Abstracts.ProductService;


import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("api/products")
public class ProductController {

    private List<Product> products = new ArrayList<Product>();
    private ProductService productService;
    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.add(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return products;
    }


}
