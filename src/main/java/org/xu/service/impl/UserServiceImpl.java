package org.xu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xu.dao.UserDao;
import org.xu.entity.User;
import org.xu.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private  UserDao Dao;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(UserDao Dao){
        this.Dao = Dao;
    }

    @Override
    public void insert(User user) {
        System.out.println("service插入数据");
        Dao.insert(user);
    }

    @Override
    public List<User> QueryAll() {
        System.out.println("service查询数据");
        return Dao.QueryAll();
    }
}
