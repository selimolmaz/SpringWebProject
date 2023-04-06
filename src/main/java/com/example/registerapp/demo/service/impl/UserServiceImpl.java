package com.example.registerapp.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.registerapp.demo.dto.UserDTO;
import com.example.registerapp.demo.model.User;
import com.example.registerapp.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void createUser(UserDTO userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        System.out.println("Kişinin adı: " + user.getFirstName() + " " + "Kişinin soyadı: " + user.getLastName() + " \n" + "Kişinin mail adresi: " + user.getEmail());
    }
}
