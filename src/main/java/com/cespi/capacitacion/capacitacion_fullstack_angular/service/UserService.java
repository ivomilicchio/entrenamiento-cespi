package com.cespi.capacitacion.capacitacion_fullstack_angular.service;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import java.util.List;

public interface UserService {

    User save(String phoneNumber, String password);

}
