package com.tech.securityapplication.service;

import com.tech.securityapplication.dao.UserRepo;
import com.tech.securityapplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
