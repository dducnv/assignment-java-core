package com.example.t2009m1helloworld;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.User;
import com.example.t2009m1helloworld.model.MySqlAccountModel;
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
        account.setUsername("Duc");
        account.setPhone("0383665477");
        account.setEmail("hello@gmail.com");
        account.setBirthday("07/12/2002");
        account.setPassword("hello");
        boolean result = mySqlAccountModel.Save(account);
        System.out.println(result);
    }
}
