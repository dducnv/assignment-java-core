package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.User;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlCategoryModel implements CategoryModel {

    @Override
    public boolean Save(Category category) {
        Connection connection= ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into categories (name) value (?)");
            preparedStatement.setString(1,category.getName());
            preparedStatement.execute();
            return true;
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean Update(int id, Category updateCategory) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from categories where status = ?");
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int status = resultSet.getInt("status");
                Category category = new Category(id,name,status);
                categories.add(category);
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findById(int id) {
        return null;
    }
}
