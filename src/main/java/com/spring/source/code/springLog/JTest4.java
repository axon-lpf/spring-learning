package com.spring.source.code.springLog;

import com.spring.source.code.jdbcTemplate.entities.BookDO;
import com.spring.source.code.jdbcTemplate.service.IBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbc_template.xml")
public class JTest4 {

    @Autowired
    private IBookService bookService;

    @Test
    public void test(){
        BookDO book = bookService.getBook(1);
        System.out.println(book);
    }
}
