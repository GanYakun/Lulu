package com.example.demo.UserLoginDao.UserDao;

import com.example.demo.UserLoginDao.UserEntity.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUsers() throws Exception;
    User createUser() throws Exception;
    User deleteUser() throws Exception;
    User updateUser() throws Exception;
}
