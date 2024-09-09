package com.spring.source.code.beanAnnotation.service.impl;

import com.spring.source.code.beanAnnotation.enttites.Order;
import com.spring.source.code.beanAnnotation.service.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl  implements IOrderService {
    @Override
    public boolean create(Order order) {
        System.out.println("保存成功");
        return true;
    }

    @Override
    public Order queryOrder(String orderId) {
        System.out.println("查询成功");
        return null;
    }
}
