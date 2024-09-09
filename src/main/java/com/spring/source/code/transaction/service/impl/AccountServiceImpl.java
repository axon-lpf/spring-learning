package com.spring.source.code.transaction.service.impl;

import com.spring.source.code.transaction.dao.IAccountDao;
import com.spring.source.code.transaction.entities.AccountDO;
import com.spring.source.code.transaction.entities.BookDO;
import com.spring.source.code.transaction.service.IAccountService;
import com.spring.source.code.transaction.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    private IBookService bookService;

    @Override
    public boolean addBalance(AccountDO account) {
        return accountDao.addBalance(account);
    }

    @Override
    public boolean subBalance(AccountDO account) {
        return accountDao.subBalance(account);
    }

    @Transactional(rollbackFor = Exception.class, timeout = -1)
    @Override
    public boolean addSubBalance(AccountDO addAccount, AccountDO subAccount) {
        boolean b = false;
        try {
            b = accountDao.addBalance(addAccount);
            if (b) {
                BookDO bookDO = new BookDO();
                bookDO.setName("事务");
                bookDO.setAuthor("spring");
                bookService.createBook(bookDO);
                int result = 1 / 0;
                b = accountDao.subBalance(subAccount);
            }
        } catch (Exception e) {
            throw e;
        } finally {
        }
        return b;
    }

}
