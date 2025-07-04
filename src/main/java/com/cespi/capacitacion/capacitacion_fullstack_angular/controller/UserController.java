package com.cespi.capacitacion.capacitacion_fullstack_angular.controller;

import com.cespi.capacitacion.capacitacion_fullstack_angular.dto.UserCreationDTO;
import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import com.cespi.capacitacion.capacitacion_fullstack_angular.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public User save(@RequestBody UserCreationDTO userCreationDTO) {
        return userService.save(userCreationDTO.getPhoneNumber(), userCreationDTO.getPassword());
    }
}
