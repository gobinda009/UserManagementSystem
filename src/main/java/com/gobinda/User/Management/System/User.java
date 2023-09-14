package com.gobinda.User.Management.System;

public class User {
    private Integer UserId;
    private String Name;
    private String UserName;
    private String Address;
    private Long PhoneNumber;

    public User(Integer userId, String name, String userName, String address, Long phoneNumber) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
