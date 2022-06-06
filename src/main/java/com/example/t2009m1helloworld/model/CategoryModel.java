package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.Category;

import java.util.List;

public interface CategoryModel {
    boolean Save(Category category);
    List<Category> getAll();
    Category findById(int id);
    boolean Update (int id, Category updateCategory);
    boolean Delete (int id);

}
