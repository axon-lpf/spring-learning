package com.spring.source.code.transaction.entities;

import java.math.BigDecimal;

public class AccountDO {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    private Integer id;

    private  String name;

    private BigDecimal balance;

    @Override
    public String toString() {
        return "AccountDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
