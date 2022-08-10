package com.example.demo3liquibase.service;

import com.example.demo3liquibase.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User findByUser(String name);
    User createUser(User user);
    User updateUser(User user,int id);
    void deleteUser(int id);
}
