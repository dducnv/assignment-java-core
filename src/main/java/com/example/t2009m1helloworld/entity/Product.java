package com.example.t2009m1helloworld.entity;

import com.example.t2009m1helloworld.entity.Base.BaseEntity;
import com.example.t2009m1helloworld.entity.myenum.ProductStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product extends BaseEntity {
    int Id;
    String Name;
    String Thumbnail;
    double Price;
    int Quantity;
    int CategoryId;
    String Description;
    String Details;
    ProductStatus Status;

    public Product() {
    }

    public Product(int id, String name, String thumbnail, double price, int quantity, int categoryId, String description, String details, ProductStatus status) {
        Id = id;
        Name = name;
        Thumbnail = thumbnail;
        Price = price;
        Quantity = quantity;
        CategoryId = categoryId;
        Description = description;
        Details = details;
        Status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public ProductStatus getStatus() {
        return Status;
    }

    public void setStatus(ProductStatus status) {
        Status = status;
    }

    public static final class ProductBuilder {
        int Id;
        String Name;
        String Thumbnail;
        double Price;
        int Quantity;
        int CategoryId;
        String Description;
        String Details;
        ProductStatus Status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime deletedAt;
        private int createdBy;
        private int updatedBy;
        private int deletedBy;

        private ProductBuilder() {
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProductBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ProductBuilder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public ProductBuilder createdBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public ProductBuilder updatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public ProductBuilder deletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public ProductBuilder Id(int Id) {
            this.Id = Id;
            return this;
        }

        public ProductBuilder Name(String Name) {
            this.Name = Name;
            return this;
        }

        public ProductBuilder Thumbnail(String Thumbnail) {
            this.Thumbnail = Thumbnail;
            return this;
        }

        public ProductBuilder Price(double Price) {
            this.Price = Price;
            return this;
        }

        public ProductBuilder Quantity(int Quantity) {
            this.Quantity = Quantity;
            return this;
        }

        public ProductBuilder CategoryId(int CategoryId) {
            this.CategoryId = CategoryId;
            return this;
        }

        public ProductBuilder Description(String Description) {
            this.Description = Description;
            return this;
        }

        public ProductBuilder Details(String Details) {
            this.Details = Details;
            return this;
        }

        public ProductBuilder Status(ProductStatus Status) {
            this.Status = Status;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setId(Id);
            product.setName(Name);
            product.setThumbnail(Thumbnail);
            product.setPrice(Price);
            product.setQuantity(Quantity);
            product.setCategoryId(CategoryId);
            product.setDescription(Description);
            product.setDetails(Details);
            product.setStatus(Status);
            product.deletedAt = this.deletedAt;
            product.createdBy = this.createdBy;
            product.updatedAt = this.updatedAt;
            product.updatedBy = this.updatedBy;
            product.createdAt = this.createdAt;
            product.deletedBy = this.deletedBy;
            return product;
        }
    }
}
