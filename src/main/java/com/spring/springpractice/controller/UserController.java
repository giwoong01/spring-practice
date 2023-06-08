package com.spring.springpractice.controller;

import com.spring.springpractice.entity.Users;
import com.spring.springpractice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Users> getUsers(@RequestParam(required = false, defaultValue = "") String name) {
        return userService.getUsersService(name);
    }

    @PostMapping("/user")
    public String createUser(@RequestBody Users user) {
        return userService.createUserService(user);
    }
}
