package com.spring.source.code.transaction.dao.impl;

import com.spring.source.code.transaction.dao.IAccountDao;
import com.spring.source.code.transaction.entities.AccountDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addBalance(AccountDO account) {

        String sql = "UPDATE account SET balance =? WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, account.getBalance(), account.getId());
        return rowsAffected > 0;
    }

    @Override
    public boolean subBalance(AccountDO account) {
        String sql = "UPDATE account SET balance =? WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, account.getBalance(), account.getId());
        return rowsAffected > 0;
    }
}
