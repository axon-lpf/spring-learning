package com.spring.source.code.transaction.dao;

import com.spring.source.code.transaction.entities.AccountDO;

public interface IAccountDao {

    boolean addBalance(AccountDO account);


    boolean subBalance(AccountDO account);
}
