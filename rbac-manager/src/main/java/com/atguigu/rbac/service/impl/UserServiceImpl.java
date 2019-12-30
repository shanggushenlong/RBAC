package com.atguigu.rbac.service.impl;

import com.atguigu.rbac.bean.User;
import com.atguigu.rbac.dao.UserDao;
import com.atguigu.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
