package com.spring.source.code.aop.aspectXml;

import com.spring.source.code.aop.aspectXml.service.IBookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AopXmlTest {

    /**
     * 完全基于xml的处理
     */
    @Test
    public void aopTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop_xml.xml");
        IBookService commonService = context.getBean("bookService", IBookService.class);
        commonService.queryBook("我是一颗小石头");
    }

}
