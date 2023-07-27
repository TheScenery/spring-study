package com.thescenery.service;

import com.thescenery.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    @Override
    public void readUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.readUser();
    }
}
