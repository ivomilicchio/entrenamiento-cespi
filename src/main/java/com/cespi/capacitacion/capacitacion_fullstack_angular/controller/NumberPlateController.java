package com.cespi.capacitacion.capacitacion_fullstack_angular.controller;

import com.cespi.capacitacion.capacitacion_fullstack_angular.dto.NumberPlateCreationDTO;
import com.cespi.capacitacion.capacitacion_fullstack_angular.entity.NumberPlate;
import com.cespi.capacitacion.capacitacion_fullstack_angular.service.NumberPlateServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number-plates")
public class NumberPlateController {

    private final NumberPlateServiceImpl numberPlateServiceImpl;

    public NumberPlateController(NumberPlateServiceImpl numberPlateServiceImpl) {
        this.numberPlateServiceImpl = numberPlateServiceImpl;
    }

    @PostMapping()
    public NumberPlate save(@RequestBody NumberPlateCreationDTO numberPlateCreationDTO) {
        return numberPlateServiceImpl.save(numberPlateCreationDTO.getNumber());
    }
}
