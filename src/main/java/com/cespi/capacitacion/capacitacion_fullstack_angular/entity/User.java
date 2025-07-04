package com.cespi.capacitacion.capacitacion_fullstack_angular.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
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
            unique = true,
            nullable = false,
            length = 10
    )
    private String phoneNumber;

    @Column(
            nullable = false
    )
    private String password;

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

    public User(long id, String phoneNumber, String password) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
        numberPlates = new ArrayList<NumberPlate>();
        currentAccount = new CurrentAccount();
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

    public List<NumberPlate> getNumberPlates() {
        return numberPlates;
    }

    public void setNumberPlates(List<NumberPlate> numberPlates) {
        this.numberPlates = numberPlates;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }
}
