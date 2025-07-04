package com.cespi.capacitacion.capacitacion_fullstack_angular.repository;

import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.NumberPlate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberPlateRepository extends JpaRepository<NumberPlate, Long> {

}
