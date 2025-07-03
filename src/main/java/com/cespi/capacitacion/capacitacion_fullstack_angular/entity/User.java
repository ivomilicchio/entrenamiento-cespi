package com.cespi.capacitacion.capacitacion_fullstack_angular.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO)
    private Long id;
    @Column(
            unique = true,
            length = 10,
            nullable = false)
    private String phoneNumber;


    public User() {

    }

    public User(long id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
