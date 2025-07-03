package com.cespi.capacitacion.capacitacion_fullstack_angular.service;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    User findById(Long id);
    void deleteById(Long id);
    User update(User user);
}
