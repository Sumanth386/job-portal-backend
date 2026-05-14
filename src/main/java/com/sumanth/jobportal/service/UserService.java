package com.sumanth.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.jobportal.entity.User;
import com.sumanth.jobportal.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register new user
    public User registerUser(User user) {

        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    // Get user by ID
    public User getUserById(Integer id) {

        return userRepository.findById(id).orElse(null);
    }
}