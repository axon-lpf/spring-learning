package com.spring.source.code.transaction.service.impl;

import com.spring.source.code.transaction.dao.IBookDao;
import com.spring.source.code.transaction.entities.BookDO;
import com.spring.source.code.transaction.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public boolean createBook(BookDO book) {
        return bookDao.createBook(book);
    }

    @Override
    public boolean updateBook(BookDO book) {
        return bookDao.updateBook(book);
    }

    @Override
    public BookDO getBook(Integer id) {
        return bookDao.getBook(id);
    }

    @Override
    public List<BookDO> queryBooks(BookDO bookDO) {
        return bookDao.queryBooks(bookDO);
    }
}
