package com.example.t2009m1helloworld.model.sql_modal;

import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.model.ProductModel;
import com.example.t2009m1helloworld.model.constant.SqlConstant;
import com.example.t2009m1helloworld.util.ConnectionHelper;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlProductModel implements ProductModel {
     Connection connection = ConnectionHelper.getConnection();
    @Override
    public boolean Save(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_INSERT);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setString(2,product.getThumbnail());
            preparedStatement.setDouble(3,product.getPrice());
            preparedStatement.setInt(4,product.getQuantity());
            preparedStatement.setString(5,product.getDescription());
            preparedStatement.setString(6,product.getDetails());
            preparedStatement.setInt(7,product.getCategoryId());
            preparedStatement.setInt(8,product.getStatus().getValue());
            preparedStatement.setString(9,product.getCreatedAt().toString());
            preparedStatement.setString(10,product.getUpdatedAt().toString());
            preparedStatement.executeUpdate();
            return true;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_ALL_ADMIN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(SqlConstant.PRODUCT_FIELD_ID);
                String name = resultSet.getString(SqlConstant.PRODUCT_FIELD_NAME);
                String thumbnail = resultSet.getString(SqlConstant.PRODUCT_FIELD_THUMBNAIL);
                int quantity = resultSet.getInt(SqlConstant.PRODUCT_FIELD_QUANTITY);
                double price = resultSet.getDouble(SqlConstant.PRODUCT_FIELD_PRICE);
                int category_id = resultSet.getInt(SqlConstant.PRODUCT_FIELD_CATEGORY_ID);
                String description = resultSet.getString(SqlConstant.PRODUCT_FIELD_DESCRIPTION);
                String details = resultSet.getString(SqlConstant.PRODUCT_FIELD_DETAILS);
                Product product = new Product();
                product.setId(id);
                product.setName(name);
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

    @Override
    public Product findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int product_id = resultSet.getInt(SqlConstant.PRODUCT_FIELD_ID);
                String name = resultSet.getString(SqlConstant.PRODUCT_FIELD_NAME);
                String thumbnail = resultSet.getString(SqlConstant.PRODUCT_FIELD_THUMBNAIL);
                int quantity = resultSet.getInt(SqlConstant.PRODUCT_FIELD_QUANTITY);
                double price = resultSet.getDouble(SqlConstant.PRODUCT_FIELD_PRICE);
                int category_id = resultSet.getInt(SqlConstant.PRODUCT_FIELD_CATEGORY_ID);
                String description = resultSet.getString(SqlConstant.PRODUCT_FIELD_DESCRIPTION);
                String details = resultSet.getString(SqlConstant.PRODUCT_FIELD_DETAILS);
                Product product = new Product();
                product.setId(product_id);
                product.setName(name);
                product.setThumbnail(thumbnail);
                product.setQuantity(quantity);
                product.setPrice(price);
                product.setCategoryId(category_id);
                product.setDescription(description);
                product.setDetails(details);
                return product;

            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
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
