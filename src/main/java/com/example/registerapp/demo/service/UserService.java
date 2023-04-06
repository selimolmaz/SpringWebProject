package com.example.registerapp.demo.service;

import org.springframework.stereotype.Service;

import com.example.registerapp.demo.dto.UserDTO;


public interface UserService {
    //Create User 
    public void createUser(UserDTO userDTO);
}