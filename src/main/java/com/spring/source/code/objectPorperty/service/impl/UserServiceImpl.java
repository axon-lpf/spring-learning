package com.spring.source.code.objectPorperty.service.impl;

import com.spring.source.code.objectPorperty.dao.IUserDao;
import com.spring.source.code.objectPorperty.entities.User;
import com.spring.source.code.objectPorperty.service.IUserService;

public class UserServiceImpl implements IUserService {

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public IUserDao userDao;

    @Override
    public boolean saveUser(User user) {
        userDao.save(user);
        System.out.println("UserServiceImpl接口");
        return false;
    }
}
