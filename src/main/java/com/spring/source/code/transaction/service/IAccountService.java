package com.spring.source.code.transaction.service;

import com.spring.source.code.transaction.entities.AccountDO;

public interface IAccountService {

    boolean addBalance(AccountDO account);


    boolean subBalance(AccountDO account);

    boolean addSubBalance(AccountDO addAccount,AccountDO subAccount);
}
