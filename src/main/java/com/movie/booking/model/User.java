package com.movie.booking.model;

import com.movie.booking.types.Gender;

public class User {
    private Integer id;
    private String name;
    private String emailId;
    private Gender gender;
    private String mobileNumber;

    public User(Integer id, String name, String emailId, Gender gender, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
