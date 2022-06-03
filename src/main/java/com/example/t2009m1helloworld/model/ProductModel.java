package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Product;

import java.util.List;

public interface ProductModel {
    Product findById(int id);
    boolean Save(Product product);
    boolean Update(Product product);
    boolean Delete(int id);
    List<Product> getAll();

}
