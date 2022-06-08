package com.example.t2009m1helloworld.model.constant;

public class SqlConstant {
    public static final String FIELD_CREATED_AT = "createdAt";
    public static final String FIELD_UPDATED_AT = "updatedAt";
    public static final String FIELD_DELETED_AT = "deletedAt";
    public static final String FIELD_CREATED_BY = "createdBy";
    public static final String FIELD_UPDATED_BY = "updatedBy";
    public static final String FIELD_DELETED_BY = "deletedBy";

    //    CATEGORY SQL COMMAND
    public static final String CATEGORY_INSERT = "INSERT INTO categories (name, status , createdAt, updatedAt, createdBy, updatedBy ) VALUES (?, ?, ?, ?, ?, ?);";
    public static final String CATEGORY_UPDATE = "UPDATE categories SET name = ?,createdAt = ?, updatedAt = ?, createdBy = ?, updatedBy = ?, status = ? WHERE id = ?;";
    public static final String CATEGORY_DELETE = "DELETE FROM categories WHERE id = ?;";
    public static final String CATEGORY_FIND_BY_ID = "SELECT * FROM categories WHERE id = ? AND status = ?;";
    public static final String CATEGORY_FIND_ALL = "SELECT * FROM categories;";

    public static final String CATEGORY_FIELD_ID = "id";
    public static final String CATEGORY_FIELD_NAME = "name";
    //END OF CATEGORY SQL COMMAND
//*---------------------------------------------------------------*//
    //PRODUCT SQL COMMAND
    //, createdBy, updatedBy
    public static final String PRODUCT_INSERT = "INSERT INTO products (name,thumbnail,price,quantity,description,details,category_id,status" +
        ",createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String PRODUCT_UPDATE = "UPDATE products SET name = ?,thumbnail=?,price=?,quantity=?,description=?,details=?,category_id=?,status=?" +
        "createdAt = ?, updatedAt = ?, createdBy = ?, updatedBy = ? WHERE id = ?;";
    public static final String PRODUCT_DELETE = "DELETE FROM products WHERE id = ?;";
    public static final String PRODUCT_FIND_BY_ID = "SELECT * FROM products WHERE id = ?";
    public static final String PRODUCT_FIND_ALL_ADMIN = "SELECT * FROM products;";
    public static final String PRODUCT_FIND_ALL = "SELECT * FROM products WHERE status = ?;";

    public static final String PRODUCT_FIELD_ID = "id";
    public static final String PRODUCT_FIELD_NAME = "name";
    public static final String PRODUCT_FIELD_THUMBNAIL = "thumbnail";
    public static final String PRODUCT_FIELD_PRICE = "price";
    public static final String PRODUCT_FIELD_QUANTITY = "quantity";
    public static final String PRODUCT_FIELD_DESCRIPTION = "description";
    public static final String PRODUCT_FIELD_DETAILS = "details";
    public static final String PRODUCT_FIELD_CATEGORY_ID = "category_id";
    //END OF PRODUCT SQL COMMAND


    //ACCOUNT SQL COMMAND
    public static final String ACCOUNT_INSERT = "INSERT INTO accounts (username, password, roleId, status, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?);";
    public static final String ACCOUNT_UPDATE = "UPDATE accounts SET username = ?, password = ?, roleId = ?, status = ?, createdAt = ?, updatedAt = ?, createdBy = ?, updatedBy = ? WHERE id = ?;";
    public static final String ACCOUNT_DELETE = "DELETE FROM accounts WHERE id = ?;";
    public static final String ACCOUNT_FIND_BY_ID = "SELECT * FROM accounts WHERE id = ? AND status = ?;";
    public static final String ACCOUNT_FIND_ALL = "SELECT * FROM accounts;";
    public static final String ACCOUNT_FIND_BY_USERNAME = "SELECT * FROM accounts WHERE username = ? AND status = ?;";
}
