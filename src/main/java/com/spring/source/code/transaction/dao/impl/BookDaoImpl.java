package com.spring.source.code.transaction.dao.impl;

import com.spring.source.code.transaction.dao.IBookDao;
import com.spring.source.code.transaction.entities.BookDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements IBookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean createBook(BookDO book) {
        String sql = "INSERT INTO books (name, author) VALUES (?, ?)";
        int rowsAffected = jdbcTemplate.update(sql, book.getName(), book.getAuthor());
        return rowsAffected > 0;
    }

    @Override
    public boolean updateBook(BookDO book) {
        String sql = "UPDATE books SET name = ?, author = ? WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getId());
        return rowsAffected > 0;
    }

    @Override
    public BookDO getBook(Integer id) {
        String sql = "SELECT * FROM books WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new BookDO(rs.getInt("id"), rs.getString("name"), rs.getString("author"))
        );
    }

    @Override
    public List<BookDO> queryBooks(BookDO bookDO) {
        String sql = "SELECT * FROM books WHERE name LIKE ? AND author LIKE ?";
        return jdbcTemplate.query(sql, new Object[]{
                        "%" + bookDO.getName() + "%",
                        "%" + bookDO.getAuthor() + "%"
                },
                (rs, rowNum) -> new BookDO(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("author")
                )
        );
    }
}
