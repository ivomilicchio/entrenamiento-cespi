package com.cespi.capacitacion.capacitacion_fullstack_angular.service;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import com.cespi.capacitacion.capacitacion_fullstack_angular.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User save(String phoneNumber, String password) {
        User user = new User(phoneNumber, password);
        return userRepository.save(user);
    }
}
