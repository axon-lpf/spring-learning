package com.spring.source.code.jdbcTemplate;

import com.spring.source.code.jdbcTemplate.entities.BookDO;
import com.spring.source.code.jdbcTemplate.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class JdbcTemplateTest {


    /**
     * 基于xml的处理
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_template.xml");
        IBookService bookService = context.getBean("bookServiceImpl", IBookService.class);
        BookDO bookDO = new BookDO();
        bookDO.setName("阿西吧");
        bookDO.setAuthor("金庸");
        bookService.createBook(bookDO);

        bookDO.setAuthor("禁用");
        bookDO.setName("天龙八部");
        bookDO.setId(1);
        bookService.updateBook(bookDO);
        List<BookDO> bookDOS = bookService.queryBooks(bookDO);
        System.out.println(bookDOS);

    }


    /**
     *  全自动注解开发
     */
    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcTemplateSpringConfig.class);
        IBookService bookService = context.getBean("bookServiceImpl", IBookService.class);
        BookDO bookDO = new BookDO();
        bookDO.setName("射雕英雄传");
        bookDO.setAuthor("金庸");
        bookService.createBook(bookDO);
    }


}
