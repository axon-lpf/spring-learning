package com.spring.source.code.beanAnnotation.service;


import com.spring.source.code.beanAnnotation.enttites.Order;

public interface IOrderService {

    boolean create(Order order);

    Order queryOrder(String orderId);
}
