package com.example.demo3liquibase.service;

import com.example.demo3liquibase.models.User;
import com.example.demo3liquibase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findByUser(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, int id) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
