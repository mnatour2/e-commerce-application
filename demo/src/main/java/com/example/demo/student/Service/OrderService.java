package com.example.demo.student.Service;

import com.example.demo.student.Model.Order;
import com.example.demo.student.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public void addOrder(Order order) {
        orderRepository.save(order);

    }
}
