package com.gymsoftware.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "membership_id")
    private membership membership;

    @Column(name="password")
    private String password;

    private Date birthdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public com.gymsoftware.model.membership getMembership() {
        return membership;
    }

    public void setMembership(com.gymsoftware.model.membership membership) {
        this.membership = membership;
    }
}
