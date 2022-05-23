package com.example.t2009m1helloworld.entity;

public class Account {
    String fullName;
    String phone;
    String email;
    String birthday;
    String username;
    String password;
    public  Account(){

    }
    public Account(String fullName, String phone, String email, String birthday, String username, String password) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
