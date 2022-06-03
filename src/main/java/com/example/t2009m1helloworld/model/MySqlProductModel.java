package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlProductModel implements ProductModel {
    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public boolean Save(Product product) {
        Connection connection = ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into products (title,thumbnail,quantity,price,category_id,description,details) value (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, product.getTitle());
            preparedStatement.setString(2, product.getThumbnail());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.setInt(5, product.getCategoryId());
            preparedStatement.setString(6, product.getDescription());
            preparedStatement.setString(7, product.getDetails());
            preparedStatement.execute();
            return true;
        } catch (SQLException exception) {
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

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String thumbnail = resultSet.getString("thumbnail");
                int quantity = resultSet.getInt("quantity");
                int price = resultSet.getInt("price");
                int category_id = resultSet.getInt("category_id");
                String description = resultSet.getString("description");
                String details = resultSet.getString("details");
                Product product = new Product();
                product.setId(id);
                product.setTitle(title);
                product.setThumbnail(thumbnail);
                product.setQuantity(quantity);
                product.setPrice(price);
                product.setCategoryId(category_id);
                product.setDescription(description);
                product.setDetails(details);
                products.add(product);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return products;
    }
}
