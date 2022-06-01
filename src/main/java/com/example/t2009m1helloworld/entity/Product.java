package com.example.t2009m1helloworld.entity;

import com.example.t2009m1helloworld.entity.Base.BaseEntity;
import com.example.t2009m1helloworld.entity.myenum.ProductStatus;

import java.time.LocalDateTime;

public class Product extends BaseEntity {
    int Id;
    String Title;
    String Thumbnail;
    String Description;
    int Price;
    int Quantity;
    String Details;
    String manufacturerEmail;
    String manufacturerPhone;
    int status;

    public Product() {
    }

    public Product(int id, String title, String thumbnail, String description, int price, int quantity, String details, String manufacturerEmail, String manufacturerPhone, int status) {
        Id = id;
        Title = title;
        Thumbnail = thumbnail;
        Description = description;
        Price = price;
        Quantity = quantity;
        Details = details;
        this.manufacturerEmail = manufacturerEmail;
        this.manufacturerPhone = manufacturerPhone;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getManufacturerEmail() {
        return manufacturerEmail;
    }

    public void setManufacturerEmail(String manufacturerEmail) {
        this.manufacturerEmail = manufacturerEmail;
    }

    public String getManufacturerPhone() {
        return manufacturerPhone;
    }

    public void setManufacturerPhone(String manufacturerPhone) {
        this.manufacturerPhone = manufacturerPhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
