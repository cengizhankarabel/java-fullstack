package com.example.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name= "employees")
public class Employee {

    @Id
    @Column(name="e_id")
    private int id;
    @Column(name="e_name", length = 100, nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name="time") @Temporal(TemporalType.TIME)
    private Date dob;
    @Lob  // large object
    private String profile; // > 255
//    @Lob
//    private byte[] profilePic;

    public Gender getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

//    public byte[] getProfilePic() {
//        return profilePic;
//    }
//
//    public void setProfilePic(byte[] profilePic) {
//        this.profilePic = profilePic;
//    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
