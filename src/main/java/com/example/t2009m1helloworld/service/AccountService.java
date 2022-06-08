package com.example.t2009m1helloworld.service;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.model.AccountModel;
import com.example.t2009m1helloworld.model.sql_modal.MySqlAccountModel;
import com.example.t2009m1helloworld.util.SHA512Hasher;

public class AccountService {
    private AccountModel accountModel;

    public AccountService() {
        this.accountModel = new MySqlAccountModel();
    }

    public Account register(Account account) {
        String salt = SHA512Hasher.randomString(7);
        String passwordHashed = SHA512Hasher.encode(account.getPassword(), salt);
        account.setPassword(passwordHashed + "." + salt);
        accountModel.Save(account);
        return account;
    }

    public Account login(String username, String password) {
        Account accountFound = accountModel.findByUsername(username);
        if (accountFound == null) {
            return null;
        }
        if (SHA512Hasher.checkPassword(accountFound.getPassword(), password)) {
            return accountFound;
        }
        return null;
    }

}
