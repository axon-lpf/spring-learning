package com.spring.source.code.objectPorperty.dao.impl;

import com.spring.source.code.objectPorperty.dao.IUserDao;
import com.spring.source.code.objectPorperty.entities.User;

public class UserDaoImpl implements IUserDao {
    @Override
    public boolean save(User user) {
        System.out.println("我要保存数据" + user);
        return true;
    }
}
