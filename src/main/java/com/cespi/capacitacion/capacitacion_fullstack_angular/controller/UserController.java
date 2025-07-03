package com.cespi.capacitacion.capacitacion_fullstack_angular.controller;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import com.cespi.capacitacion.capacitacion_fullstack_angular.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
