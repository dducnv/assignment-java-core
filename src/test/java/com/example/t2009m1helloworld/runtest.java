package com.example.t2009m1helloworld;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.entity.User;
import com.example.t2009m1helloworld.entity.myenum.AccountStatus;
import com.example.t2009m1helloworld.entity.myenum.ProductStatus;
import com.example.t2009m1helloworld.model.sql_modal.MySqlAccountModel;
import com.example.t2009m1helloworld.model.sql_modal.MySqlCategoryModel;
import com.example.t2009m1helloworld.model.sql_modal.MySqlProductModel;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class runtest {
    @Test
    void SaveProduct(){
        Product product = new Product(); // create new product
        product.setName("Máy ảnh Fujifilm Instax Mini 11 Ice White");
        product.setThumbnail("https://kyma.vn/StoreData/images/Product/may-anh-fujifilm-instax-mini-11-ice-white-trang.webp");
        product.setPrice(1100000);
        product.setQuantity(10);
        product.setCategoryId(1);
        product.setDescription("This is a description");
        product.setDetails("This is a details");
        product.setStatus(ProductStatus.getProductStatus(1));
        MySqlProductModel mySqlProductModel = new MySqlProductModel();
        boolean result = mySqlProductModel.Save(product);
        System.out.println(result);
    }
    @Test
    void getAllProduct(){
        MySqlProductModel mySqlProductModel = new MySqlProductModel();
        List<Product> products = mySqlProductModel.getAll();
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
    @Test
    void findById(){
        MySqlProductModel mySqlProductModel = new MySqlProductModel();
        Product product = mySqlProductModel.findById(1);
        System.out.println(product.getName());
    }
    @Test
    void AddAccount(){
        Account account = new Account();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRoleID(1);
        account.setStatus(AccountStatus.getAccountStatus(1));
        MySqlAccountModel mySqlAccountModel = new MySqlAccountModel();
        boolean result = mySqlAccountModel.Save(account);
        System.out.println(result);
    }
    @Test
    void findByName(){
        MySqlAccountModel mySqlAccountModel = new MySqlAccountModel();
        Account accounts = mySqlAccountModel.findByUsername("admin");
        System.out.println(accounts.getUsername());

    }
}
