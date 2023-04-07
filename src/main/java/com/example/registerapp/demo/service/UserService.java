package com.example.registerapp.demo.service;

import java.util.List;

import com.example.registerapp.demo.dto.UserDTO;
import com.example.registerapp.demo.model.User;


public interface UserService {
    // Create User
    public User createUser(UserDTO userDTO);

    // Get all users from the database
    List<User> getAllUsers();

    // Get user by id
    User getUserById(Long id);

    // Delete user by id
    void deleteUserById(Long id);

    // Save user
    User save(User user);


}