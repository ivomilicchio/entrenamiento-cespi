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

    public CurrentAccount() {
        this.balance = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
