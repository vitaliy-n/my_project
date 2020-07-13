package com.cheba00.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "bank_roll")
    private Integer bank_roll;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBank_roll() {
        return bank_roll;
    }

    public void setBank_roll(Integer bank_roll) {
        this.bank_roll = bank_roll;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
