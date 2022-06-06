package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Product;

import java.util.List;

public interface ProductModel {
    boolean Save(Product product);
    List<Product> getAll();
    Product findById(int id);
    boolean Update(Product product);
    boolean Delete(int id);


}
