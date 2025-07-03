package com.cespi.capacitacion.capacitacion_fullstack_angular.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "number_plates")
public class NumberPlate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(
            length = 7,
            nullable = false,
            unique = true)
    private String number;
}
