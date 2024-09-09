package com.spring.source.code.aop.aspectXml.service.impl;

import com.spring.source.code.aop.aspectXml.service.IBookService;

public class BookServiceImpl implements IBookService {
    @Override
    public void queryBook(String name) {
        System.out.println("查询到书记" + name);
    }
}
