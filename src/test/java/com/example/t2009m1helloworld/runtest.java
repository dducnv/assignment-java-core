package com.example.t2009m1helloworld;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.entity.User;
import com.example.t2009m1helloworld.model.MySqlAccountModel;
import com.example.t2009m1helloworld.model.MySqlCategoryModel;
import com.example.t2009m1helloworld.model.MySqlProductModel;
import com.example.t2009m1helloworld.model.MySqlUserModel;
import org.junit.jupiter.api.Test;

public class runtest {
    @Test
    void name() {
        MySqlUserModel mySqlUserModel = new MySqlUserModel();
        User hello = mySqlUserModel.findById(1);
        System.out.println(hello.getUsername());
    }
    @Test
    void addAccount(){
        MySqlAccountModel mySqlAccountModel = new MySqlAccountModel();
        Account account = new Account();
        account.setFullName("Duc");
        account.setUsername("Duc25");
        account.setPhone("0383665479");
        account.setEmail("hello25@gmail.com");
        account.setBirthday("07/12/2002");
        account.setPassword("hello");
        boolean result = mySqlAccountModel.Save(account);
        System.out.println(result);
    }
    @Test
    void addCategory(){
        MySqlCategoryModel mySqlCategoryModel = new MySqlCategoryModel();
        Category category = new Category();
        category.setName("May Anh");
        boolean result = mySqlCategoryModel.Save(category);
        System.out.println(result);

    }
    @Test
    void addProduct(){
        MySqlProductModel mySqlProductModel = new MySqlProductModel();
        Product product = new Product();
        product.setThumbnail("image.png");
        product.setTitle("May Anh");
        product.setPrice(100000);
        product.setDescription("May Anh");
        product.setQuantity(30);
        product.setDetails("May Anh");
       boolean result =  mySqlProductModel.Save(product);
        System.out.println(result);
    }
}
