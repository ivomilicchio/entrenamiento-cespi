package com.cespi.capacitacion.capacitacion_fullstack_angular.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(
            length = 10,
            unique = true,
            nullable = false
    )
    private String phoneNumber;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_number_plates",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "number_plate_id")
    )
    private List<NumberPlate> numberPlates;

    @OneToOne
    @JoinColumn(name = "current_account_id")
    private CurrentAccount currentAccount;

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
