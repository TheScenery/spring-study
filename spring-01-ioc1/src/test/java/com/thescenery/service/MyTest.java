package com.thescenery.service;
import com.thescenery.dao.UserDaoImpl;
import com.thescenery.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.readUser();
    }
}
