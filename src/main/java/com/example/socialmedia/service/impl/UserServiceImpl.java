package com.example.socialmedia.service.impl;

import com.example.socialmedia.repositary.UserRepositary;
import com.example.socialmedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositary userRepositary;
}
