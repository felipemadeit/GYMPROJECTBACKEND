package com.gymsoftware.model;


import jakarta.persistence.*;

@Entity
@Table(name="memberships")

public class membership {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;



    private String membershipName;

    private Double membershipPrice;

    private int membershipDuration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public Double getMembershipPrice() {
        return membershipPrice;
    }

    public void setMembershipPrice(Double membershipPrice) {
        this.membershipPrice = membershipPrice;
    }

    public int getMembershipDuration() {
        return membershipDuration;
    }

    public void setMembershipDuration(int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }
}
