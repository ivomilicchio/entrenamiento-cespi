package com.cespi.capacitacion.capacitacion_fullstack_angular.repository;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
