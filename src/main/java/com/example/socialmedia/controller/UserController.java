package com.example.socialmedia.controller;

import com.example.socialmedia.model.User;
import com.example.socialmedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "saved";
    }

    @GetMapping("/fetch")
    public List<User> getall() {
        return userService.getall();
    }

    @PutMapping("/update")
    public void Update(int id, String name) {
        userService.update(id, name);
    }


}
