package com.cespi.capacitacion.capacitacion_fullstack_angular.controller;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import com.cespi.capacitacion.capacitacion_fullstack_angular.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
