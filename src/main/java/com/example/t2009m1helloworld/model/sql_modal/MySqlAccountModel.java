package com.example.t2009m1helloworld.model.sql_modal;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.model.AccountModel;
import com.example.t2009m1helloworld.model.constant.SqlConstant;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class MySqlAccountModel implements AccountModel {
    Connection connection = ConnectionHelper.getConnection();
    @Override
    public boolean Save(Account account) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.ACCOUNT_INSERT);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setInt(3, account.getRoleID());
            preparedStatement.setInt(4, account.getStatus().getValue());
            preparedStatement.setString(5,account.getCreatedAt().toString());
            preparedStatement.setString(6,account.getUpdatedAt().toString());
            preparedStatement.executeUpdate();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    public Account findById(int id) {
        return null;
    }

    @Override
    public Account findByUsername(String username) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.ACCOUNT_FIND_BY_USERNAME);
            preparedStatement.setString(1, username);
            preparedStatement.setInt(2, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setUsername(resultSet.getString("username"));
                account.setPassword(resultSet.getString("password"));
                account.setRoleID(resultSet.getInt("role_id"));
                return account;
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean Update(int id, Account updateAccount) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }
}
