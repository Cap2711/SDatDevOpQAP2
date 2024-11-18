package com.keyin.entities;


import javax.persistence.*;
import javax.persistence.Id;
import java.util.List;
import java.util.Date;

@Entity
public class Member {

    @Id
    @SequenceGenerator(name = "member_sequence", sequenceName = "member_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "member_sequence")
    private Long id;

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private Date startDate;
    private Integer membershipDuration;

    @ManyToMany
    private List<Tournament> tournaments;

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public Integer getMembershipDuration() {
        return membershipDuration;
    }

    public void setMembershipDuration(Integer membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
