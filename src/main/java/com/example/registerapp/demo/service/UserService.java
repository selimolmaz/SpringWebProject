package com.example.registerapp.demo.service;

import org.springframework.stereotype.Service;

import com.example.registerapp.demo.dto.UserDTO;
import com.example.registerapp.demo.model.User;

@Service
public class UserService {

    public void createUser(UserDTO userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        System.out.println("Kişinin adı: " + user.getFirstName() + " " + "Kişinin soyadı: " + user.getLastName());
    }
}