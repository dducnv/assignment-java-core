package com.example.t2009m1helloworld.model.sql_modal;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.User;
import com.example.t2009m1helloworld.model.CategoryModel;
import com.example.t2009m1helloworld.model.constant.SqlConstant;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlCategoryModel implements CategoryModel {
    private ConnectionHelper connectionHelper;
    public MySqlCategoryModel() {
        this.connectionHelper = new ConnectionHelper();
    }

    @Override
    public boolean Save(Category category) {

        Connection connection = connectionHelper.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_INSERT);
            preparedStatement.setString(1, category.getName());
            preparedStatement.setInt(2, category.getStatus().getValue());
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try {
            Connection connection = connectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt(SqlConstant.CATEGORY_FIELD_ID));
                category.setName(resultSet.getString(SqlConstant.CATEGORY_FIELD_NAME));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public boolean Update(int id, Category updateCategory) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }
}
