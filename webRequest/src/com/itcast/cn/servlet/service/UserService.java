package com.itcast.cn.servlet.service;

import com.itcast.cn.servlet.dao.UserDao;
import com.itcast.cn.servlet.entity.User;

/**
 * @author shkstart
 * @create 2019-04-13 16:06
 */
public class UserService {
    private UserDao userDao = new UserDao();

    public User login(String username, String password) {
        return userDao.findUser(username, password);
    }
}
