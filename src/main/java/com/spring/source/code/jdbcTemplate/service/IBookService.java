package com.spring.source.code.jdbcTemplate.service;

import com.spring.source.code.jdbcTemplate.entities.BookDO;

import java.util.List;

public interface IBookService {

    boolean createBook(BookDO book);


    boolean updateBook(BookDO book);


    BookDO getBook(Integer id);

    List<BookDO>  queryBooks(BookDO bookDO);
}
