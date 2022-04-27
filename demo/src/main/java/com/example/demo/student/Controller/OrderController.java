package com.example.demo.student.Controller;

import com.example.demo.student.Model.Order;
import com.example.demo.student.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }



    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }


    @PostMapping("/addorder")
    public void addCategory(@RequestBody Order order) {
        orderService.addOrder(order);
    }

}
