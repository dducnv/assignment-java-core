package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.User;

import java.util.List;

public interface UserModel {
    boolean Save(User user);
    boolean Update (int id, User userUpdate);
    boolean Delete (int id);
    List<User> getAll();
    User findById(int id);
}
