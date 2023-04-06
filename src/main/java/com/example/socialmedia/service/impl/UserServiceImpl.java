package com.example.socialmedia.service.impl;

import com.example.socialmedia.model.User;
import com.example.socialmedia.repositary.UserRepositary;
import com.example.socialmedia.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositary userRepositary;

    @Override
    public User saveUser(User user) {
        return  userRepositary.save(user);
    }

    @Override
    public List<User> getall() {
        return userRepositary.findAll();
    }

    @Override
    public void update(int id, String name) {
        Optional <User> userID=userRepositary.findById(id);
        if(userID.isPresent()){
           User user=userID.get();
           user.setName(name);
           userRepositary.save(user);
        }else {
            throw new EntityNotFoundException("Id :" + id + "notfound");

        }
    }
}
