package com.Aman.Oauth2Security.service;

import com.Aman.Oauth2Security.entity.Users;
import com.Aman.Oauth2Security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users register(Users user) {
        return userRepo.save(user);
    }
}
