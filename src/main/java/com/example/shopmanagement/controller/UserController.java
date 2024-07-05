package com.example.shopmanagement.controller;

import com.example.shopmanagement.model.User;
import com.example.shopmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Indicates that this class is a RESTful controller
@RequestMapping("/api/users") // Maps HTTP requests to /api/users to this controller
public class UserController {
    @Autowired
    private UserService userService; // Injects the UserService

    // Handles POST requests to /api/users/register
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user); // Registers a new user
    }

    // Handles GET requests to /api/users/{username}
    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username); // Retrieves user details by username
    }
}
