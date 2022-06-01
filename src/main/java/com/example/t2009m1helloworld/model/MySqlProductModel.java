package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlProductModel implements ProductModel
{
    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public boolean Save(Product product) {
        Connection connection= ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into products (title,thumbnail,quantity,price,description,details) value (?,?,?,?,?,?)");
            preparedStatement.setString(1,product.getTitle());
            preparedStatement.setString(2,product.getThumbnail());
            preparedStatement.setInt(3,product.getQuantity());
            preparedStatement.setInt(4,product.getPrice());
            preparedStatement.setString(5,product.getDescription());
            preparedStatement.setString(6,product.getDetails());
            preparedStatement.execute();
            return true;
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean Update(Product product) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }
}
