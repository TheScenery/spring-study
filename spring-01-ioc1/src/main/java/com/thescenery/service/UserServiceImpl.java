package com.thescenery.service;

import com.thescenery.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void readUser() {
        userDao.readUser();
    }
}
