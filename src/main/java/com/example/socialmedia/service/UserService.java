package com.example.socialmedia.service;

import com.example.socialmedia.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getall();

    public void update(int id,String name);
}
