package com.cespi.capacitacion.capacitacion_fullstack_angular.service;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import com.cespi.capacitacion.capacitacion_fullstack_angular.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User update(User user) {
        return null;
    }
}
