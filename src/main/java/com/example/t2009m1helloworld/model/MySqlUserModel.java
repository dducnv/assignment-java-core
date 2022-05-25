package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.User;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlUserModel implements UserModel{

    @Override
    public boolean Save(User user){
        Connection connection= ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users (username,password,status) value (?,?,?)");
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setInt(3,user.getStatus());
            preparedStatement.execute();
            return true;
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean Update(int id, User userUpdate) {
        Connection connection= ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update  users set username = ?, password = ?, status = ? where id = ?");
            preparedStatement.setString(1,userUpdate.getUsername());
            preparedStatement.setString(2,userUpdate.getPassword());
            preparedStatement.setInt(3,userUpdate.getStatus());
            preparedStatement.setInt(4,id);
            preparedStatement.execute();
            return true;
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return  false;
    }

    @Override
    public boolean Delete(int id) {

        Connection connection= ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update  users set status = ? where id = ?");
            preparedStatement.setInt(1,-1);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
            return true;
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return  false;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where status = ?");
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int status = resultSet.getInt("status");
                User user = new User(id,username,password,status);
                users.add(user);
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return users;
    }

    @Override
    public User findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where status = ? and id = ?");
            preparedStatement.setInt(1,1);
            preparedStatement.setInt(2,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int userId = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int status = resultSet.getInt("status");
                User user = new User(userId,username,password,status);
                return user;
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return null;
    }
}
