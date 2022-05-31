package com.example.t2009m1helloworld.entity;

import java.util.HashMap;

public class Account {
    int id;
    String fullName;
    String phone;
    String email;
    String birthday;
    String username;
    String password;
    public  Account(){
    }

    public Account(int id, String fullName, String phone, String email, String birthday, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    private HashMap<String, String> errors = new HashMap<>();

    public boolean isValid() {
       checkValid();
       return errors.size() == 0;
    }

    public void checkValid (){
        errors.clear();
        if (fullName == null || fullName.isEmpty()) {
            errors.put("fullName", "Full name is required");
        }
        if (phone == null || phone.isEmpty()) {
            errors.put("phone", "Phone is required");
        }
        if (email == null || email.isEmpty()) {
            errors.put("email", "Email is required");
        }
        if (birthday == null || birthday.isEmpty()) {
            errors.put("birthday", "Birthday is required");
        }
        if (username == null || username.isEmpty()) {
            errors.put("username", "Username is required");
        }
        if (password == null || password.isEmpty() ) {
            errors.put("password", "Password is required");
        }

    }

    public HashMap<String, String> getError() {
           return errors;
    }
}
