package com.example.odev.repositories.concretes;

import com.example.odev.repositories.abstracts.OrderRepository;
import com.example.odev.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orders;
    Order a = new Order(5);
    public OrderRepositoryImpl() {
        orders = new ArrayList<>();
    }

    public Order save(Order order) {
        orders.add(order);
        return order;
    }
    public void delete(int Id) {

    }
    public void update() {

    }
    public Order get(int Id) {
        return null;
    }
    public List<Order> getAll() {
        return orders;
    }

}
