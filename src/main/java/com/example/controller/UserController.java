package com.example.controller;

import org.springframework.stereotype.Controller;
import com.example.service.UserService;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name)
    {
        userService.addUsers(name);
        System.out.println("users added: " + name);
    }
    public void listUsers()
    {
        List<String> users=userService.getAllUsers();
        System.out.println("List of all users: " + users);
    }
}
