package com.cespi.capacitacion.capacitacion_fullstack_angular.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "current_accounts")
public class CurrentAccount {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(
            nullable = false
    )
    private float balance;
}
