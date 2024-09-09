package com.spring.source.code.springLog;


import com.spring.source.code.jdbcTemplate.entities.BookDO;
import com.spring.source.code.jdbcTemplate.service.IBookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
@ExtendWith(SpringExtension.class)
*/
@ContextConfiguration("classpath:jdbc_template.xml")
public class JTest5 {

    @Autowired
    private IBookService bookService;

    @Test
    public void test(){
        BookDO book = bookService.getBook(1);
        System.out.println(book);
    }
}
