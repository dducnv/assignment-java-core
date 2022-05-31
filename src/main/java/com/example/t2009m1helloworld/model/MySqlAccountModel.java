package com.example.t2009m1helloworld.model;
import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.util.ConnectionHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class MySqlAccountModel implements AccountModel{
    @Override
    public boolean Save(Account account) {
        Connection connection= ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into account (full_name,username,phone,email,birthday,password) value (?,?,?,?,?,?)");
            preparedStatement.setString(1,account.getFullName());
            preparedStatement.setString(2,account.getUsername());
            preparedStatement.setString(3,account.getPhone());
            preparedStatement.setString(4,account.getEmail());
            preparedStatement.setString(5,account.getBirthday());
            preparedStatement.setString(6,account.getPassword());
            preparedStatement.execute();
            return true;
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean Update(int id, Account updateAccount) {
        return false;
    }
    @Override
    public boolean Delete(int id) {
        return false;
    }
    @Override
    public List<Account> getAll() {
        return null;
    }
    @Override
    public Account findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from account  id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int account_id = resultSet.getInt("id");
                String full_name = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String birthday = resultSet.getString("birthday");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                Account accountModel = new Account(account_id,full_name,phone,email,birthday,username,password);
               return accountModel;
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return null;
    }
}
