package com.example.demo.UserLoginDao.UserDaoImpl;

import com.example.demo.UserLoginDao.UserDao.UserDao;
import com.example.demo.UserLoginDao.UserEntity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    public List<User> findAllUsers() throws Exception{
        List<User> users = new ArrayList<>();
        return users;
    }
    public User deleteUser() throws Exception{
        User user = new User();
        return user;
    }
    public User updateUser() throws Exception{
        User user = new User();
        return user;
    }
    public User createUser() throws Exception{
        User user = new User();
        return user;
    }
}
